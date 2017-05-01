package ru.zvezdov.ocprof.chapter_7.Concurrency.Basic.ExecutorServiceApi;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author Dmitry Zvezdov
 *         18.04.17.
 */
public class AddData {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            Future<Integer> result = service.submit(() -> 30+11);
            System.out.println(result.get());

            service.submit(() -> {Thread.sleep(1000); return null;});
//            service.submit(() -> {Thread.sleep(1000);}); //Doesn't compile

        }finally {
            if (service != null) service.shutdown();
        }
    }
}
