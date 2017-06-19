package ru.zvezdov.ocprof.chapter_7.Concurrency.Basic.ExecutorServiceApi;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author Dmitry Zvezdov
 *         04.06.17.
 */
public class ScheduledExecutorServiceTraining {
    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        service.schedule(() -> {
            System.out.println("Hello");
        }, 3, TimeUnit.SECONDS);
//        service.shutdown();
        System.out.println("alal");


    }
}
