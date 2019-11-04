package cn.balalals.game_server.test;

import cn.balalals.game_server.protobuf.LoginMsg;
import cn.balalals.game_server.protobuf.Msg;
import cn.balalals.game_server.protobuf.MsgType;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.handler.codec.LengthFieldPrepender;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;

import java.net.InetSocketAddress;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        new Client().start("localhost", 9090);
    }

    private void start(String host, int port) throws InterruptedException {
        NioEventLoopGroup group = new NioEventLoopGroup();
        Bootstrap bootstrap = new Bootstrap();
        bootstrap.channel(NioSocketChannel.class)
                .group(group)
                .remoteAddress(new InetSocketAddress(host, port))
                .handler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    protected void initChannel(SocketChannel socketChannel) {
                        socketChannel.pipeline().addLast(new LengthFieldPrepender(2));
                        socketChannel.pipeline().addLast(new LengthFieldBasedFrameDecoder(65535, 0, 2, 0, 2));
                        // 增加protobuf编解码支持
                        socketChannel.pipeline().addLast(new ProtobufEncoder());
                        socketChannel.pipeline().addLast(new ProtobufDecoder(Msg.getDefaultInstance()));
                    }
                });
        ChannelFuture future = bootstrap.connect().sync();
        future.addListener((ChannelFutureListener) channelFuture -> {
            if(channelFuture.isSuccess()) {
                LoginMsg.Builder builder = LoginMsg.newBuilder();
                builder.setAccount("asd");
                builder.setPassword("a");
                Msg.Builder m = Msg.newBuilder();
                m.setContent(builder.build().toByteString());
                m.setMsgType(MsgType.LOGIN);
                channelFuture.channel().writeAndFlush(m.build());
            }
        });
    }
}
