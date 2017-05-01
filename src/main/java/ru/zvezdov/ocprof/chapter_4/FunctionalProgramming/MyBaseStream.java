package ru.zvezdov.ocprof.chapter_4.FunctionalProgramming;

import java.util.Iterator;
import java.util.Spliterator;

/**
 * @author Dmitry Zvezdov
 *         28.04.17.
 */
public interface MyBaseStream<T, S extends MyBaseStream<T, S>> extends AutoCloseable {

    Iterator<T> iterator();
    Spliterator<T> spliterator();

    boolean isParallel();
    S sequental();
    S parallel();
    S unordered();
    S onClose(Runnable closeHandler);

    @Override
    void close();
}
