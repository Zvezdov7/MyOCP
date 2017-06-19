package ru.zvezdov.ocprof.chapter_7.Concurrency.Basic.ThreadAndRunnable;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author Dmitry Zvezdov
 *         05.06.17.
 */
public class join1 {
    public static void main(String[] args) throws InterruptedException {

        Thread.currentThread().join(10000);

//        System.out.println("Start");
//
//        Stream<Integer> stream = Arrays.asList(1,2,3,4,5,6,7,8,9).stream();
//        Thread thread = new Thread(() -> {
//            try {
//                Thread.sleep(250);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            stream.forEach((s) -> {
//                System.out.println(s);
//                try {
//                    Thread.sleep(300);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }});
//        });
//        thread.setDaemon(true);
//        thread.start();
//        thread.join();
//
//        System.out.println("End");

    }
}
