package ru.zvezdov.ocprof.chapter_7.Concurrency.Test;

/**
 * @author Dmitry Zvezdov
 *         15.06.17.
 */
public class _3_Reordering {
    int x = 0, y = 0;
    public void writer() {
        x = 1;
        y = 2;
        System.out.println("x = " + x + " y = " + y);

    }
    public void reader() {
        int i1 = y;
        int i2 = x;
        System.out.println("i1 = " + i1 + " i2 = " + i2);
    }

    public static void main(String[] args) {
        _3_Reordering reordering = new _3_Reordering();
        new T2(reordering).start();
        new T1(reordering).start();
    }
}

class T1 extends Thread {
    _3_Reordering object;

    public T1(_3_Reordering object) {
        this.object = object;
    }

    @Override
    public void run() {
        object.reader();
    }
}

class T2 extends Thread {
    _3_Reordering object;

    public T2(_3_Reordering object) {
        this.object = object;
    }

    @Override
    public void run() {
        object.writer();
    }
}