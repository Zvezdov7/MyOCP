package ru.zvezdov.ocprof.chapter_7.Concurrency.Basic.ExecutorServiceApi;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author Dmitry Zvezdov
 *         02.06.17.
 */
public class ExecutorsTraining {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Future> list = new ArrayList<>();
        ScheduledExecutorService service = null;
        try {
            service = Executors.newScheduledThreadPool(10);
            for (int i = 0; i < 15; i++) {
                Future<?> future = service.submit(new Call());
                list.add(future);
            }
        } finally {
            if (service != null) { service.shutdown(); }
        }

        if (service !=null){
            service.awaitTermination(1, TimeUnit.DAYS);
            System.out.println(service.isTerminated());
        }

        for (Future future : list) {
            if (future.isDone()) {
                System.out.println("Ring is done, result is: " + future.get());
            }
        }

//        try {
//            service = Executors.newSingleThreadExecutor();
//            Future submit = service.submit(new ExceptionCall());
//            System.out.println(submit.get());
//        } catch (ExecutionException e) {
//            System.out.println("AAAaaah");
//        } finally {
//            service.shutdown();
//        }
    }
}

class Call implements Callable {

    static int attemt = 0;
    @Override
    public Object call() throws Exception {
        System.out.println("Ring...");
        return ++attemt;
    }
}
class ExceptionCall implements Callable {

    @Override
    public Object call() throws Exception {
        throw new Exception();
    }
}
