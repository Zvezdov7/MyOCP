package ru.zvezdov.ocprof.chapter_4.FunctionalProgramming.Test;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Dmitry Zvezdov
 *         14.06.17.
 */
public class _2_Atomic_compareAndSet {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        int oldVal = 0;
        int newVal = 1;
        atomicInteger.compareAndSet(0, 1);
        System.out.println(atomicInteger.get());
    }
}
