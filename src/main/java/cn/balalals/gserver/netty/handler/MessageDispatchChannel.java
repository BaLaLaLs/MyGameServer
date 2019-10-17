package cn.balalals.gserver.netty.handler;

import cn.balalals.gserver.SpringContext;
import cn.balalals.gserver.dispatch.CommandTask;
import cn.balalals.gserver.protobuf.Msg;
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
        SpringContext.getMessageDispatcher().addMessageTask(new CommandTask(msg));
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        super.exceptionCaught(ctx, cause);
        ctx.channel().close();
        cause.printStackTrace();
    }
}
