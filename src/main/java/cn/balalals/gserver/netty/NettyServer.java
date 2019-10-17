package cn.balalals.gserver.netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelOption;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.net.InetSocketAddress;

@Component
public class NettyServer {
    private Logger logger = LoggerFactory.getLogger(NettyServer.class);
    private ServerBootstrap bootstrap = new ServerBootstrap();
    private NioEventLoopGroup boss = new NioEventLoopGroup();
    private NioEventLoopGroup work = new NioEventLoopGroup();
    private ChannelFuture future;

    /**
     * netty 启动逻辑
     * @param host int
     * @param port String
     */
    public void start(String host, int port) {
        InetSocketAddress inetSocketAddress = new InetSocketAddress(host, port);
        bootstrap.channel(NioServerSocketChannel.class)
            .group(boss, work)
            .option(ChannelOption.SO_BACKLOG, 1024)
            .localAddress(inetSocketAddress)
            .childHandler(new NettyInitializer());
        future = bootstrap.bind();
        future.addListener((ChannelFutureListener) channelFuture -> {
            if (channelFuture.isSuccess()) {
                logger.info("Netty服务启动成功!!!!");
            }
        });
    }

    /**
     * netty关闭逻辑
     */
    public void destroy() {
        future.channel().close();
        boss.shutdownGracefully().addListener(channelFuture -> {
            if (!channelFuture.isSuccess()) {
                logger.error("boss EventLoopGroup关闭失败！！！");
                channelFuture.cause().printStackTrace();
                return;
            }
            logger.info("boss EventLoopGroup关闭成功！！！");
        });
        work.shutdownGracefully().addListener(channelFuture -> {
            if (!channelFuture.isSuccess()) {
                logger.error("work EventLoopGroup关闭失败！！！");
                channelFuture.cause().printStackTrace();
                return;
            }
            logger.info("work EventLoopGroup关闭成功！！！");
        });
    }
}
