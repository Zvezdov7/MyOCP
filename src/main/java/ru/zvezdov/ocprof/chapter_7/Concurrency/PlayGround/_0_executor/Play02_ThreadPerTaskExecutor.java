package ru.zvezdov.ocprof.chapter_7.Concurrency.PlayGround._0_executor;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Dmitry Zvezdov
 *         07.06.17.
 */
public class Play02_ThreadPerTaskExecutor {
    public static void main(String[] args) {
        Executor executor = getNewExecutor();
        executor.execute(getTask());
        executor.execute(getTask());
        executor.execute(getTask());

        Executor executor1 = getNewExecutor();
        executor1.execute(getTask());
        executor1 .execute(getTask());
    }

    private static Runnable getTask() {
        return new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello" + Thread.currentThread());
            }
        };
    }

    private static Executor getNewExecutor() {
        return new Executor() {
            private final AtomicInteger index = new AtomicInteger(0);
            private final ThreadGroup group = new ThreadGroup("MyGroup");
            @Override
            public void execute(Runnable command) {
                Thread thread = new Thread(group, command);
                thread.setPriority(Thread.MAX_PRIORITY-1);
                thread.setName("Thread#" + index.getAndIncrement());
                thread.start();
            }
        };
    }
}
