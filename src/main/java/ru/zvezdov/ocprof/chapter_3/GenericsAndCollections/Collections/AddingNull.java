package ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Collections;

import java.util.*;

/**
 * @author Dmitry Zvezdov
 *         23.04.17.
 */
public class AddingNull {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new LinkedList<>();
        list.add(null);
        list.add(null);
        list1.add(null);
        list1.add(null);
        System.out.println(list);
        System.out.println(list1);

        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        hashSet.add(null);
        hashSet.add(null);
        System.out.println(hashSet);
        for (Iterator<Integer> iterator = hashSet.iterator(); iterator.hasNext(); ) {
            System.out.println(iterator.next());
        }
//        treeSet.add(null); // NullPointerException
        Deque<Integer> arrayDeque = new ArrayDeque<>();
//        arrayDeque.add(null); // NullPointerException

        Map<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(1, null);
        hashMap.put(null, 1);
        hashMap.put(0, 1);
        System.out.println(hashMap);

        Map<String, Integer> treeMap = new TreeMap<>();
//        treeMap.put(null, 1); // NullPointerException
        treeMap.put("1", null);
        treeMap.put("1", null);
        System.out.println(treeMap);
        

    }
}
