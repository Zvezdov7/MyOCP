package ru.zvezdov.ocprof.chapter_7.Concurrency.PlayGround._0_executor;

import java.util.concurrent.Executor;

/**
 * @author Dmitry Zvezdov
 *         07.06.17.
 */
public class Play01 {
    public static void main(String[] args) {
        Executor executor = getNewExecutor();
        executor.execute(getTask());
        executor.execute(getTask());
    }

    private static Runnable getTask() {
        throw new UnsupportedOperationException();
    }

    private static Executor getNewExecutor() {
        throw new UnsupportedOperationException();
    }
}
