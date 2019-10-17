package cn.balalals.gserver;

import cn.balalals.gserver.dispatch.DispatchTask;
import cn.balalals.gserver.dispatch.HandlerDispatcher;
import cn.balalals.gserver.dispatch.MessageDispatcher;
import cn.balalals.gserver.netty.handler.message.MessageHandler;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Calendar;
import java.util.Collection;
import java.util.Map;

@Component
public class SpringContext implements ApplicationContextAware {
    private static ApplicationContext applicationContext;
    private static MessageDispatcher messageDispatcher;
    private static HandlerDispatcher handlerDispatcher;

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        applicationContext = context;

    }
    public static <T> T getBean(Class<T> clazz) {
        return applicationContext.getBean(clazz);
    }
    public final static <T> Map getBeansOfType(Class<T> clazz) {
        return applicationContext.getBeansOfType(clazz);
    }

    public final static <T> T getBean(String name, Class<T> requiredType) {
        return applicationContext.getBean(name, requiredType);
    }
    @Resource
    public void setMessageDispatcher(MessageDispatcher messageDispatcher) {
        SpringContext.messageDispatcher = messageDispatcher;
    }
    public static MessageDispatcher getMessageDispatcher() {
        return messageDispatcher;
    }
    @Resource
    public void setHandlerDispatcher(HandlerDispatcher handlerDispatcher) {
        SpringContext.handlerDispatcher = handlerDispatcher;
    }
    public static HandlerDispatcher getHandlerDispatcher() {
        return SpringContext.handlerDispatcher;
    }
}
