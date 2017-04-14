package ru.zvezdov.ocprof.chapter_4.FunctionalProgramming.StramApi.CommonIntermediateOperations;

import java.util.stream.Stream;

/**
 * @author Dmitry Zvezdov
 *         13.04.17.
 */
public class Sorted {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("Beauty girl girl girl", "One more beauty girl", "One more more");
//        s.sorted().forEach(System.out::println);
        s.sorted((s1, s2) -> s1.length() - s2.length()).forEach(System.out::println);
    }
}
