package ru.zvezdov.ocprof.chapter_4.FunctionalProgramming.StramApi.CommonIntermediateOperations;

import java.util.stream.Stream;

/**
 * @author Dmitry Zvezdov
 *         13.04.17.
 */
public class Map {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("Mon", "Murr", "Mau");
        s.map(String::length).forEach(System.out::println);

    }
}
