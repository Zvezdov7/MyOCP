package ru.zvezdov.ocprof.chapter_4.FunctionalProgramming.StramApi.StreamPrinting;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Dmitry Zvezdov
 *         14.04.17.
 */
public class Printing {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("AA", "Bb", "cc");
        Stream<String> stream2 = Stream.of("AA", "Bb", "cc");
        Stream<String> stream3 = Stream.of("AA", "Bb", "cc");
        Stream<String> stream4 = Stream.of("AA", "Bb", "cc");

        stream1.forEach(System.out::println);
        System.out.println(stream2.collect(Collectors.toList()));
        stream3.peek(System.out::println).count();
        stream4.limit(5).forEach(System.out::println);
    }
}
