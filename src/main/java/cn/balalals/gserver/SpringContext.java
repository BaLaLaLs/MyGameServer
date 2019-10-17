package cn.balalals.gserver;

import cn.balalals.gserver.dispatch.MessageDispatcher;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Map;

@Component
public class SpringContext implements ApplicationContextAware {
    private static ApplicationContext applicationContext;
    private static MessageDispatcher messageDispatcher;

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        applicationContext = context;

    }
    public static <T> T getBean(Class<T> clazz) {
        return applicationContext.getBean(clazz);
    }
    public static <T> Map<String, T> getBeansOfType(Class<T> clazz) {
        return applicationContext.getBeansOfType(clazz);
    }

    public static <T> T getBean(String name, Class<T> requiredType) {
        return applicationContext.getBean(name, requiredType);
    }
    @Resource
    public void setMessageDispatcher(MessageDispatcher messageDispatcher) {
        SpringContext.messageDispatcher = messageDispatcher;
    }
    public static MessageDispatcher getMessageDispatcher() {
        return messageDispatcher;
    }
}
