package ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Collections.Queue.commonMethods;

import java.util.ArrayDeque;

/**
 * @author Dmitry Zvezdov
 *         23.04.17.
 */
public class Deq {
    public static void main(String[] args) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.offer("a");
        arrayDeque.offer("b");
        arrayDeque.push("c");
        System.out.println(arrayDeque.pollFirst());

    }
}
