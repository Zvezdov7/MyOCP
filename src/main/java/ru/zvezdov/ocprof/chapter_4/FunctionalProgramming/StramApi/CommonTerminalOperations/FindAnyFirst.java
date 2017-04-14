package ru.zvezdov.ocprof.chapter_4.FunctionalProgramming.StramApi.CommonTerminalOperations;

import java.util.stream.Stream;

/**
 * @author Dmitry Zvezdov
 *         13.04.17.
 */
public class FindAnyFirst {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("Sun", "Mon", "Bron");
        Stream<String> infinite = Stream.generate(() -> "chimb");
        s.findAny().ifPresent(System.out::println);
        infinite.findAny().ifPresent(System.out::println);

    }
}
