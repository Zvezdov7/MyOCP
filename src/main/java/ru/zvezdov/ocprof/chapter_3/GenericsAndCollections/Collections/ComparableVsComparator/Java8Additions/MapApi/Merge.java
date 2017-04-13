package ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Collections.ComparableVsComparator.Java8Additions.MapApi;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

/**
 * @author Dmitry Zvezdov
 *         13.04.17.
 */
public class Merge {
    public static void main(String[] args) {
        Map<String, String> favorites = new HashMap<>();
        favorites.put("Jenny", "Bus Tour");
//        favorites.put("Jenny", "Tram");
        System.out.println(favorites);

        favorites.put("Tom", null);

        favorites.putIfAbsent("Jenny", "Tram");
        favorites.putIfAbsent("Sam", "Tram");
        favorites.putIfAbsent("Tom", "Tram");
        System.out.println(favorites);


        BiFunction<String, String, String> mapper = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;

        String jenny = favorites.merge("Jenny", "Skyride", mapper);
        String tom = favorites.merge("Tom", "Skyride", mapper);
        System.out.println(favorites);
        System.out.println(jenny);
        System.out.println(tom);

    }
}
