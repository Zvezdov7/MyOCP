package ru.zvezdov.ocprof.chapter_7.Concurrency.PlayGround._0_executor;

/**
 * @author Dmitry Zvezdov
 *         07.06.17.
 */
public class Play00 {
    public static void main(String[] args) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        };
        new Thread(task).start();
    }
}
