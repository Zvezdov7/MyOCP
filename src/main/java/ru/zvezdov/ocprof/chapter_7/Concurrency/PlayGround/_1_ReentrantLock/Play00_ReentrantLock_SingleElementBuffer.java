package ru.zvezdov.ocprof.chapter_7.Concurrency.PlayGround._1_ReentrantLock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Dmitry Zvezdov
 *         08.06.17.
 */
public class Play00_ReentrantLock_SingleElementBuffer {
    private final Lock lock = new ReentrantLock(true); // Честность
    private final Condition notEmpty = lock.newCondition();
    private final Condition notFull = lock.newCondition();
    private Integer elem = null;

    public void put(int newElem) throws InterruptedException {
        lock.lock();
        try {
            while (this.elem != null) {
                notFull.await();
            }
            this.elem = newElem;
            notEmpty.signal();
        } finally {
            lock.unlock();
        }

    }

    public int get() throws InterruptedException {
        lock.lock();
        try {
            while (elem == null) {
                notEmpty.await();
            }
            Integer result = this.elem;
            this.elem = null;
            notFull.signal();
            return result;
        } finally {
            lock.unlock();
        }

    }
}
