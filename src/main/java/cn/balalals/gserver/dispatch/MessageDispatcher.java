package cn.balalals.gserver.dispatch;

import cn.balalals.gserver.SpringContext;
import cn.balalals.gserver.common.NamedThreadFactory;
import cn.balalals.gserver.netty.handler.message.MessageHandler;
import cn.balalals.gserver.protobuf.Msg;
import com.google.protobuf.InvalidProtocolBufferException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Component
public class MessageDispatcher {
    Logger logger = LoggerFactory.getLogger(MessageHandler.class);
    private final int CORE_SIZE = Runtime.getRuntime().availableProcessors();
    private Hashtable<String, MessageHandler> handlerMap;
    private ExecutorService[] executors = new ExecutorService[CORE_SIZE];

    @PostConstruct
    public void init() {
        for (int i = 0; i < executors.length; i++) {
            ExecutorService executor = Executors.newSingleThreadExecutor(
                    new NamedThreadFactory("message-dispatcher"));
            executors[i] = executor;
        }
    }

    public void addMessageTask(Msg msg) {
        if(handlerMap == null) {
            handlerMap = new Hashtable<>(SpringContext.getBeansOfType(MessageHandler.class));
        }
        for (Map.Entry<String, MessageHandler> entry : handlerMap.entrySet()) {
            MessageHandler messageHandler = entry.getValue();
            if(messageHandler.getMsgType() == msg.getMsgType()) {
                logger.info("匹配到：{}", entry.getKey());
                InnerDispatchTask innerDispatchTask = new InnerDispatchTask(messageHandler, msg);
                int index = innerDispatchTask.getDispatchKey() % executors.length;
                executors[index].submit(innerDispatchTask);
                return;
            }
        }
        logger.warn("没有匹配消息处理");
    }
    static class InnerDispatchTask extends DispatchTask {
        private final MessageHandler messageHandler;
        private final Msg msg;

        InnerDispatchTask(MessageHandler messageHandler, Msg msg) {
            super();
            this.messageHandler = messageHandler;
            this.msg = msg;
        }
        @Override
        public void run() {
            try {
                messageHandler.exec(messageHandler.parseFrom(msg.getContent()));
            } catch (InvalidProtocolBufferException e) {
                e.printStackTrace();
            }
        }
    }
}
