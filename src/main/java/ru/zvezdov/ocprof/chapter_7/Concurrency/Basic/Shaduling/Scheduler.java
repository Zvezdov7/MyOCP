package ru.zvezdov.ocprof.chapter_7.Concurrency.Basic.Shaduling;

import java.util.concurrent.*;

/**
 * @author Dmitry Zvezdov
 *         18.04.17.
 */
public class Scheduler {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();

        Runnable task1 = () -> System.out.println("Hey yo");
        Callable task2 = () -> "Hell yeah";

//        service.schedule(task1, 1, TimeUnit.SECONDS);
//        service.schedule(task2, 10, TimeUnit.SECONDS);
//        service.scheduleAtFixedRate(task1, 1, 1, TimeUnit.SECONDS);
//        service.scheduleWithFixedDelay(task1, 10, 5, TimeUnit.SECONDS);

        service.shutdown();

//        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}
