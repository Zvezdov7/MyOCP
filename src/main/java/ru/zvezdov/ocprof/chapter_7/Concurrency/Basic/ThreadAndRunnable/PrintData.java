package ru.zvezdov.ocprof.chapter_7.Concurrency.Basic.ThreadAndRunnable;

/**
 * @author Dmitry Zvezdov
 *         18.04.17.
 */
public class PrintData implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Printing record: " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new PrintData());
        thread.start();
//        thread.sleep(100);

        System.out.println(thread.getId());
        System.out.println(thread.getName());
        System.out.println(thread.getPriority());
        System.out.println(thread.isAlive());
        System.out.println(thread.isDaemon());

//        Thread.currentThread().join();// Deadlock


    }
}
