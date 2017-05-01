package ru.zvezdov.ocprof.chapter_7.Concurrency.Basic.ExecutorServiceApi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Dmitry Zvezdov
 *         18.04.17.
 */
public class ZooInfo {
    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            System.out.println("begin");
            service.execute(() -> System.out.println("Printing zoo"));
            service.execute(()-> {for (int i = 0; i < 3; i++) {
                System.out.println("Print record: " + i);
            }});
            service.execute(() -> System.out.println("Printing zoo"));
            System.out.println("end");
        }finally {
            if(service != null) service.shutdown();
        }
        service.shutdownNow();

        System.out.println(service.isShutdown());
        System.out.println(service.isTerminated());
    }

}
