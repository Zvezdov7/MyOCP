package ru.zvezdov.ocprof.chapter_7.Concurrency.PlayGround._0_executor;

import java.util.Collections;
import java.util.concurrent.*;

/**
 * @author Dmitry Zvezdov
 *         10.06.17.
 */
public class Play06_Shutdown {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.submit(() -> {
            Thread.sleep(1000);
            System.out.println("#1 thread");
            return null;
        });
        executorService.submit(() -> {
            Thread.sleep(3000);
            System.out.println("#2 thread");
            return null;
        });
        Future<Object> future = executorService.submit(() -> {
            Thread.sleep(5000);
            System.out.println("#3 thread");
            return null;
        });
        System.out.println(executorService.isShutdown());
        System.out.println("Shutdown");
        executorService.shutdown();
        System.out.println(executorService.isShutdown());
        try {
            executorService.awaitTermination(4, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            System.out.println("Some threads are running now");
        }
        System.out.println("Finish");

    }
}
