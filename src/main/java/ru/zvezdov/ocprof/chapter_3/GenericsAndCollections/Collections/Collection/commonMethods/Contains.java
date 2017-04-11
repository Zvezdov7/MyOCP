package ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Collections.Collection.commonMethods;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dmitry Zvezdov
 *         11.04.17.
 */
public class Contains {
    public static void main(String[] args) {
        List<String> birds = new ArrayList<>();
        birds.add("hawk");

        /**
         * Contains method call equals on each element of the ArrayList
         */
        System.out.println(birds.contains("hawk")); // true
        System.out.println(birds.contains("robin")); // false
    }
}
