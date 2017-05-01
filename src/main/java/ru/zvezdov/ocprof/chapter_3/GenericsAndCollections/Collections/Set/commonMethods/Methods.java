package ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Collections.Set.commonMethods;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Dmitry Zvezdov
 *         12.04.17.
 */
public class Methods {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        System.out.println(hashSet.add(66));
        System.out.println(hashSet.add(10));
        System.out.println(hashSet.add(66));
        System.out.println(hashSet.add(8));
        for (Integer integer : hashSet) {
            System.out.println(integer);
        }
        Set<Integer> treeSet = new TreeSet<>();
        System.out.println(treeSet.add(66));
        System.out.println(treeSet.add(10));
        System.out.println(treeSet.add(66));
        System.out.println(treeSet.add(8));
        for (Integer integer : treeSet) {
            System.out.println(integer);
        }


        /**
         * NavigableSet Interface
         */
        System.out.println("NavigableSet: ");
        NavigableSet<Integer> navigableSet = new TreeSet<>();
        for (int i = 0; i <= 20; i++) {
            navigableSet.add(i);
        }
        System.out.println(navigableSet.lower(10));
        System.out.println(navigableSet.floor(10));
        System.out.println(navigableSet.ceiling(20));
        System.out.println(navigableSet.higher(20));

    }
}
