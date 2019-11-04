package cn.balalals.game_server.netty;

import cn.balalals.game_server.netty.handler.MessageDispatchChannel;
import cn.balalals.game_server.protobuf.Msg;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.handler.codec.LengthFieldPrepender;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;

public class NettyInitializer extends ChannelInitializer<SocketChannel> {
    @Override
    protected void initChannel(SocketChannel socketChannel) {
        socketChannel.pipeline().addLast(new LengthFieldPrepender(2));
        socketChannel.pipeline().addLast(new LengthFieldBasedFrameDecoder(65535, 0, 2, 0, 2));
        // 增加protobuf编解码支持
        socketChannel.pipeline().addLast(new ProtobufEncoder());
        socketChannel.pipeline().addLast(new ProtobufDecoder(Msg.getDefaultInstance()));
        // 消息处理器
        socketChannel.pipeline().addLast(new MessageDispatchChannel());
    }
}
