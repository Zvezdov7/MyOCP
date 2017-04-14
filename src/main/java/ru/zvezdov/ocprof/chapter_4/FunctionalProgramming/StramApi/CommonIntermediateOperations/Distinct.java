package ru.zvezdov.ocprof.chapter_4.FunctionalProgramming.StramApi.CommonIntermediateOperations;

import java.util.stream.Stream;

/**
 * @author Dmitry Zvezdov
 *         13.04.17.
 */
public class Distinct {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("Elly", "Elly", "Elly", "Fuck");
        s.distinct().forEach((x) -> { System.out.println("The hero is: " + x);});

    }
}
