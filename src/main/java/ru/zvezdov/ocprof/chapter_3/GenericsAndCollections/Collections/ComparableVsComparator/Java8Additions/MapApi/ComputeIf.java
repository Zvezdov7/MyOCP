package ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Collections.ComparableVsComparator.Java8Additions.MapApi;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author Dmitry Zvezdov
 *         13.04.17.
 */
public class ComputeIf {
    public static void main(String[] args) {
        Map<String, Integer> counts = new HashMap<>();
        counts.put("Jenny", 1);

        BiFunction<String, Integer, Integer> mapper = (k, v) -> v+1;
        Integer jenny = counts.computeIfPresent("Jenny", mapper);
        Integer sam = counts.computeIfPresent("Sam", mapper);
        System.out.println(counts);
        System.out.println(jenny);
        System.out.println(sam);

        Map<String, Integer> altCounts = new HashMap<>();
        altCounts.put("Jenny", 15);
        altCounts.put("Tom", null);

        Function<String, Integer> altMapper = (k) -> 1;
        Integer altJenny = altCounts.computeIfAbsent("Jenny", altMapper);
        Integer altSam = altCounts.computeIfAbsent("Sam", altMapper);
        Integer altTom = altCounts.computeIfAbsent("Tom", altMapper);

        System.out.println(altCounts);

    }
}
