package ru.zvezdov.ocprof.chapter_7.Concurrency.ConcurrentCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author Dmitry Zvezdov
 *         18.04.17.
 */
public class CopyOnWriteCollections {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>(Arrays.asList(4, 3, 52)); // ConcurrentModificationException
        List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(4, 3, 52));
        for (Integer item : list) {
            System.out.println(item + " ");
            list.add(9);
        }
        System.out.println();
        System.out.println("Size: " + list.size());
    }
}
