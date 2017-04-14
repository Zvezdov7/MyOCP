package ru.zvezdov.ocprof.chapter_4.FunctionalProgramming.StramApi.CommonIntermediateOperations;

import java.util.stream.Stream;

/**
 * @author Dmitry Zvezdov
 *         13.04.17.
 */
public class Peek {
    public static void main(String[] args) {
//        Stream<String> stream = Stream.of("black bear", "brown bear", "grizzly");
//        long count = stream.filter(s -> s.startsWith("g")).peek(System.out::println).count();
//        System.out.println(count);
        Stream<String> stringStream = Stream.of("a1", "A", "2" , "b");
        stringStream.sorted(String::compareTo).forEach(System.out::println);


    }
}
