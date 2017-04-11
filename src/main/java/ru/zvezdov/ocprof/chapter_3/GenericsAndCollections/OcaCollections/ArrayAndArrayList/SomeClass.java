package ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.OcaCollections.ArrayAndArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Dmitry Zvezdov
 *         10.04.17.
 */
public class SomeClass {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Foo");
        list.add("Bar");

        String[] array = new String[list.size()];
        array[0] = list.get(0);
        array[1] = list.get(1);
        for (int i = 0; i < array.length; i++) {
            String s = array[i];
            System.out.println(s);
        }

        String[] array2 = {"boy", "girl"};
        List<String> list2 = Arrays.asList(array2);
        list2.set(1, "test");
        array[0] = "new";
        String[] array3 = (String[])list2.toArray();
//        list2.remove(1);

        List<Integer> list3 = Arrays.asList(9,7,5,3);
        Collections.sort(list3);
        System.out.println(Collections.binarySearch(list3, 3));
        System.out.println(Collections.binarySearch(list3, 2));
    }
}
