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

    public static void main(String[] args) {
        new Thread(new PrintData()).start();
    }
}
