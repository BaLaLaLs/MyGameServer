package cn.balalals.gserver.dispatch;

import cn.balalals.gserver.common.NamedThreadFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Component
public class MessageDispatcher {
    private final int CORE_SIZE = Runtime.getRuntime().availableProcessors();

    private ExecutorService[] executors = new ExecutorService[CORE_SIZE];

    @PostConstruct
    public void init() {
        for (int i = 0; i < executors.length; i++) {
            ExecutorService executor = Executors.newSingleThreadExecutor(
                    new NamedThreadFactory("message-dispatcher"));
            executors[i] = executor;
        }
    }

    public void addMessageTask(DispatchTask task) {
        // 根据分发id求模映射
        int index = task.getDispatchKey() % executors.length;
        executors[index].submit(task);
    }
}