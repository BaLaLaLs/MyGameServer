package cn.balalals.gserver.dispatch;

import cn.balalals.gserver.SpringContext;
import cn.balalals.gserver.protobuf.Msg;

public class CommandTask extends DispatchTask {
    private final Msg msg;
    public CommandTask(Msg msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        SpringContext.getHandlerDispatcher().dispatcher(msg);
    }
}
