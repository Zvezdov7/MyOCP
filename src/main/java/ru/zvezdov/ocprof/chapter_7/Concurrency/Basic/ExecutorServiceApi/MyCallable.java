package ru.zvezdov.ocprof.chapter_7.Concurrency.Basic.ExecutorServiceApi;

/**
 * @author Dmitry Zvezdov
 *         02.05.17.
 */
@FunctionalInterface
public interface MyCallable<V> {
    V call() throws Exception;
}
