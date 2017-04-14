package ru.zvezdov.ocprof.chapter_4.FunctionalProgramming.StramApi.CommonTerminalOperations;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author Dmitry Zvezdov
 *         13.04.17.
 */
public class MinMax {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("John", "Don", "Kelly");
//        s.min((s1, s2) -> s1.compareTo(s2));
        final Optional<String> min = s.min(String::compareTo);
        min.ifPresent(System.out::println);


        final Optional<Object> minEmpty = Stream.empty().min((s1, s2) -> 0);
        System.out.println(minEmpty.isPresent());

    }
}
