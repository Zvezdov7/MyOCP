package ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Collections.Collection.commonMethods;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dmitry Zvezdov
 *         11.04.17.
 */
public class IsEmptyAndSize {
    public static void main(String[] args) {
        List<String> birds = new ArrayList<>();
        System.out.println(birds.size()); // 0
        System.out.println(birds.isEmpty()); // true

        birds.add("sparrow");
        birds.add("sparrow");
        birds.add("hawk");

        System.out.println(birds.size()); // 3
        System.out.println(birds.isEmpty()); // false

    }
}
