package ru.zvezdov.ocprof.chapter_4.FunctionalProgramming.StramApi.CommonIntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Dmitry Zvezdov
 *         13.04.17.
 */
public class FlatMap {
    public static void main(String[] args) {
        List<String> zero = Arrays.asList();
        List<String> one = Arrays.asList("Bonny");
        List<String> two = Arrays.asList("Benny", "Money");
        Stream<List<String>> bobobo = Stream.of(zero, one, two);
        bobobo.flatMap(l -> l.stream()).forEach(System.out::println);


    }
}
