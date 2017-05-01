package ru.zvezdov.ocprof.chapter_7.Concurrency.Basic.ThreadAndRunnable;

/**
 * @author Dmitry Zvezdov
 *         18.04.17.
 */
public class Sample {
    public static void main(String[] args) {
        System.out.println("begin");
        (new ReadInventoryThread()).start();
        (new Thread(new PrintData())).start();
        (new ReadInventoryThread()).start();
        System.out.println("end");

     // Main thread run
        new PrintData().run();
        new Thread(new PrintData()).run();
        new ReadInventoryThread().run();



    }
}
