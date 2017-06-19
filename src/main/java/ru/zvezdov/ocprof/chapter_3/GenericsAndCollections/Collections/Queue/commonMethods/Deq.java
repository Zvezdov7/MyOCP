package ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Collections.Queue.commonMethods;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Dmitry Zvezdov
 *         23.04.17.
 */
public class Deq {
    public static void main(String[] args) {
        Deque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.offer("a");
        arrayDeque.offer("b");
        arrayDeque.push("c");
        System.out.println(arrayDeque.remove());
        System.out.println(arrayDeque.pollFirst());

    }
}
