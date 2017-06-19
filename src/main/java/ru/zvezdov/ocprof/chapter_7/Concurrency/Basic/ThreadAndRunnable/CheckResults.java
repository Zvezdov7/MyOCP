package ru.zvezdov.ocprof.chapter_7.Concurrency.Basic.ThreadAndRunnable;

/**
 * @author Dmitry Zvezdov
 *         18.04.17.
 */
public class CheckResults {
    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            for (int i = 0; i < 50000; i++) {
                CheckResults.counter++;
            }
        }).start();

        while (CheckResults.counter<49000){
            System.out.println("Not reached yet");
        }
        System.out.println("Reached");
    }
}
