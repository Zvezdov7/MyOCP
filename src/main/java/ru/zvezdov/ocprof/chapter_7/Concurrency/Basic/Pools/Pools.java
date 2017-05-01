package ru.zvezdov.ocprof.chapter_7.Concurrency.Basic.Pools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Dmitry Zvezdov
 *         18.04.17.
 */
public class Pools {
    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            service = Executors.newSingleThreadScheduledExecutor();
            service = Executors.newCachedThreadPool();
            service = Executors.newFixedThreadPool(10);
            service = Executors.newScheduledThreadPool(10);

        }finally {
            if (service != null) service.shutdown();
        }
    }
}
