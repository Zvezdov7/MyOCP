package ru.zvezdov.ocprof.chapter_7.Concurrency.Basic.ExecutorServiceApi;

import java.util.concurrent.*;

/**
 * @author Dmitry Zvezdov
 *         18.04.17.
 */
public class CheckResultsUp {
    public static int counter = 0;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = null;
        try{
            service = Executors.newSingleThreadExecutor();
            final Future<?> result = service.submit(() -> {
                for (int i = 0; i < 500; i++) {
                    CheckResultsUp.counter++;
                }
            });

            result.get(1, TimeUnit.NANOSECONDS);
            System.out.println("Reached");
        }catch (TimeoutException e){
            System.out.println("Not reached in time");
        }finally {
            if (service != null) service.shutdownNow();
        }
    }
}
