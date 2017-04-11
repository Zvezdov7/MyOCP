package ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Collections.Collection.commonMethods;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dmitry Zvezdov
 *         11.04.17.
 */
public class Remove {
    public static void main(String[] args) {
        List<String> birds = new ArrayList<>();
        birds.add("hawk");
        birds.add("hawk");

        System.out.println(birds.remove("cardinal")); // false
        System.out.println(birds.remove("hawk")); // true
        System.out.println(birds);
    }
}
