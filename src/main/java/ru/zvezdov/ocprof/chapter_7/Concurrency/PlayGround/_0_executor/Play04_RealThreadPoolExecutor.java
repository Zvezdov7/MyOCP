package ru.zvezdov.ocprof.chapter_7.Concurrency.PlayGround._0_executor;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Dmitry Zvezdov
 *         07.06.17.
 */
public class Play04_RealThreadPoolExecutor {
    public static void main(String[] args) {
        int corePoolSize = 4;
        int maxCorePoolSize = 64;
        long keepAliveTime = 10;
        TimeUnit unit = TimeUnit.SECONDS;
        BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<>(256);
        ThreadFactory factory = new ThreadFactory() {
//            private AtomicInteger index = new AtomicInteger(0);
            @Override
            public Thread newThread(Runnable r) {
                Thread thread = new Thread(r);
//                thread.setDaemon(true);
                return thread;
            }
        };
        RejectedExecutionHandler rejectedHandler = new RejectedExecutionHandler() {
            @Override
            public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
                throw new RejectedExecutionException("Task " + r.toString() +  "we rejected by " + executor.toString());
            }
        };
//        ExecutorService service = Executors.newSingleThreadExecutor();
//        ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
//        ExecutorService service = Executors.newCachedThreadPool();

        ExecutorService service = new ThreadPoolExecutor(
                corePoolSize,
                maxCorePoolSize,
                keepAliveTime,
                unit,
                workQueue,
                factory,
                rejectedHandler
                );

        service.execute(getTask());
        service.execute(getTask());
        service.execute(getTask());
        service.execute(getTask());
        service.execute(getTask());

        service.shutdown();

    }

    private static Runnable getTask() {
        return new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello" + Thread.currentThread());
            }
        };
    }
}
