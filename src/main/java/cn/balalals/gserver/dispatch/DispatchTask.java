package cn.balalals.gserver.dispatch;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class DispatchTask implements Runnable {
    private static AtomicInteger count = new AtomicInteger(0);

    private int dispatchKey;
    DispatchTask() {
        dispatchKey = count.getAndIncrement();
    }
    int getDispatchKey() {
        return dispatchKey;
    }
}
