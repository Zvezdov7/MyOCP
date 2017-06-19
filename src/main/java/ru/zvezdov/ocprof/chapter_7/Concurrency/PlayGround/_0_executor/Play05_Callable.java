package ru.zvezdov.ocprof.chapter_7.Concurrency.PlayGround._0_executor;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author Dmitry Zvezdov
 *         07.06.17.
 */
public class Play05_Callable {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newCachedThreadPool();

        Callable<Integer> task0 = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 42;
            }
        };

        Callable<Integer> task1 = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                while (true) {
                    if (Thread.interrupted()) break;
                }
                throw new InterruptedException();
//                Thread.sleep(5000);
//                return 24;
            }
        };

        Future<Integer> submit1 = service.submit(task0);
        Future<Integer> submit2 = service.submit(task1);
        Thread.sleep(1000);
        System.out.println("Future1 isDone()" + submit1.isDone());
        System.out.println("Future2 isDone()" + submit2.isDone());

        System.out.println("Future1.get()");
        System.out.println(submit1.get());
//        System.out.println("Future2.get()");
//        System.out.println(submit2.get()); // Повесили метод

//        List<Future<Integer>> futures = service.invokeAll(Arrays.asList(task0, task1));
        Integer integer = service.invokeAny(Arrays.asList(task0, task1));
        System.out.println("Finish" + integer);
        service.shutdownNow() ;


    }
}
