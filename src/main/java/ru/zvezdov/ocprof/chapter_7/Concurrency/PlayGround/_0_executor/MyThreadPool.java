package ru.zvezdov.ocprof.chapter_7.Concurrency.PlayGround._0_executor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;

/**
 * @author Dmitry Zvezdov
 *         07.06.17.
 */
public class MyThreadPool implements Executor {
    private final BlockingQueue<Runnable> taskQueue = new ArrayBlockingQueue<Runnable>(256);
    private final Thread[] pool;

    public MyThreadPool(int threadCount) {
        this.pool = new Thread[threadCount];
        for (int i = 0; i < pool.length; i++) {
            pool[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Runnable next = taskQueue.take();
                        next.run();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            pool[i].start();

        }
    }

    @Override
    public void execute(Runnable command) {

        try {
            taskQueue.put(command);
        } catch (InterruptedException e) {
            throw new Error();
        }
    }


}
