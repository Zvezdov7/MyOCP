package ru.zvezdov.ocprof.chapter_7.Concurrency.Basic.ExecutorServiceApi;

import ru.zvezdov.ocprof.chapter_7.Concurrency.Basic.ThreadAndRunnable.MyRunnable;

/**
 * @author Dmitry Zvezdov
 *         02.05.17.
 */
public interface MyExecutor {
    void execute(MyRunnable command);
}
