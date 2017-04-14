package ru.zvezdov.ocprof.chapter_4.FunctionalProgramming.StramApi.CommonIntermediateOperations;

import java.util.stream.Stream;

/**
 * @author Dmitry Zvezdov
 *         13.04.17.
 */
public class Filter {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("Elly", "Nelly", "Kelly");
        stringStream.filter(x -> x.startsWith("K")).forEach(System.out::println);
    }
}
