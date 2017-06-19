package ru.zvezdov.ocprof.chapter_7.Concurrency.Basic.ExecutorServiceApi;

import ru.zvezdov.ocprof.chapter_7.Concurrency.Basic.ThreadAndRunnable.MyRunnable;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author Dmitry Zvezdov
 *         02.05.17.
 */
public interface MyExecutorService extends MyExecutor{

    void shutdown();

    List<Runnable> shutdownNow();

    boolean isShutdown();

    boolean isTerminated();

    boolean awaitTermination(long timeOut, TimeUnit unit) throws InterruptedException;

    <T> Future<T> submit(MyCallable<T> task);

    <T> Future<T> submit(MyRunnable task, T result);

    Future<?> submit(MyRunnable task);

    <T> List<Future<T>> invokeAll(Collection<? extends MyCallable<T>> tasks) throws InterruptedException;

    <T> List<Future<T>> invokeAll(Collection<? extends MyCallable<T>> tasks, long timeOut, TimeUnit unit) throws InterruptedException;

    <T> T invokeAny(Collection<? extends MyCallable<T>> tasks) throws InterruptedException, ExecutionException;

    <T> T invokeAny(Collection<? extends MyCallable<T>> tasks, long timeOut, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException;

    




}
