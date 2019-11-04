package cn.balalals.game_server.netty.handler;

import cn.balalals.game_server.SpringContext;
import cn.balalals.game_server.protobuf.Msg;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MessageDispatchChannel extends SimpleChannelInboundHandler<Msg> {
    private Logger logger = LoggerFactory.getLogger(MessageDispatchChannel.class);
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        super.channelActive(ctx);
    }
    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, Msg msg) {
//        SpringContext.getMessageDispatcher().addMessageTask(new CommandTask(msg));
        SpringContext.getMessageDispatcher().addMessageTask(msg);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        super.exceptionCaught(ctx, cause);
        ctx.channel().close();
        cause.printStackTrace();
    }
}
