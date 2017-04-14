package ru.zvezdov.ocprof.chapter_4.FunctionalProgramming.StramApi.CommonTerminalOperations;

import java.util.stream.Stream;

/**
 * @author Dmitry Zvezdov
 *         13.04.17.
 */
public class ForEach {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("Mon", "Pron", "Bron");
        s.forEach(System.out::println);

    }
}
