package cn.balalals.gserver.common;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class NamedThreadFactory implements ThreadFactory {
    private final String groupName;
    private AtomicInteger idGenerator = new AtomicInteger(0);
    private ThreadGroup threadGroup = new ThreadGroup("NamedThread");

    public NamedThreadFactory(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public Thread newThread(Runnable r) {
        return new Thread(threadGroup, r, getNextThreadName(), 0);
    }
    private String getNextThreadName() {
        return this.groupName + "-thread-" + this.idGenerator.getAndIncrement();
    }
}
