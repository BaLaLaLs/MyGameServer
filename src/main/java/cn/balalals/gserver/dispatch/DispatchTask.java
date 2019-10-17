package cn.balalals.gserver.dispatch;

public abstract class DispatchTask implements Runnable {

    private int dispatchKey;

    int getDispatchKey() {
        return dispatchKey;
    }
}
