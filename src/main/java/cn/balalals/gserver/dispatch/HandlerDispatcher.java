package cn.balalals.gserver.dispatch;

import cn.balalals.gserver.SpringContext;
import cn.balalals.gserver.netty.handler.message.MessageHandler;
import cn.balalals.gserver.protobuf.LoginMsg;
import cn.balalals.gserver.protobuf.Msg;
import com.google.protobuf.InvalidProtocolBufferException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class HandlerDispatcher {
    Logger logger = LoggerFactory.getLogger(HandlerDispatcher.class);
    private Map<String, MessageHandler> handlerMap;
    void dispatcher(Msg msg) {
        if(handlerMap == null) {
            this.handlerMap = SpringContext.getBeansOfType(MessageHandler.class);
        }
        for (Map.Entry<String, MessageHandler> entry : handlerMap.entrySet()) {
            MessageHandler messageHandler = entry.getValue();
            if(messageHandler.getMsgType() == msg.getMsgType()) {
                logger.info("匹配到：{}", entry.getKey());
                try {
                    messageHandler.exec(messageHandler.parseFrom(msg.getContent()));
                } catch (InvalidProtocolBufferException e) {
                    e.printStackTrace();
                }
                return;
            }
        }
        logger.warn("没有匹配消息处理");
    }
}
