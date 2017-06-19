package ru.zvezdov.ocprof.chapter_7.Concurrency.PlayGround._0_executor;

import java.util.concurrent.Executor;

/**
 * @author Dmitry Zvezdov
 *         07.06.17.
 */
public class Play03_MyThreadPoolExecutor {
    public static void main(String[] args) {
        Executor executor = new MyThreadPool(10);
        executor.execute(getTask());
        executor.execute(getTask());
        executor.execute(getTask());
    }

    private static Runnable getTask() {
        return new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        };
    }
}
