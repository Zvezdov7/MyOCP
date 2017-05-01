package ru.zvezdov.ocprof.chapter_7.Concurrency.Basic.ThreadAndRunnable;

/**
 * @author Dmitry Zvezdov
 *         18.04.17.
 */
public class ReadInventoryThread extends Thread {
    @Override
    public void run() {
        System.out.println("Coming soon");
    }

    public static void main(String[] args) {
        (new ReadInventoryThread()).start();
    }
}
