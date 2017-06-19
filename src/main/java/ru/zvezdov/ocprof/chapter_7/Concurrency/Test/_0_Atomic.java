package ru.zvezdov.ocprof.chapter_7.Concurrency.Test;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Dmitry Zvezdov
 *         13.06.17.
 */
public class _0_Atomic {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        atomicInteger.getAndIncrement();
        atomicInteger.addAndGet(2);
    }
}
