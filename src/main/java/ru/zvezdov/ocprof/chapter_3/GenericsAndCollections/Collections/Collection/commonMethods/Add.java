package ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Collections.Collection.commonMethods;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Dmitry Zvezdov
 *         11.04.17.
 */
public class Add {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println(list.add("Sparrow")); // true
        System.out.println(list.add("Sparrow")); // true

        Set<String> set = new HashSet<>();
        System.out.println(set.add("Sparrow")); // true
        System.out.println(set.add("Sparrow")); // false

    }
}
