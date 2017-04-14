package ru.zvezdov.ocprof.chapter_4.FunctionalProgramming.StramApi.CommonIntermediateOperations;

import java.util.stream.Stream;

/**
 * @author Dmitry Zvezdov
 *         13.04.17.
 */
public class SkipLimit {
    public static void main(String[] args) {
        Stream<Integer> s = Stream.iterate(1, x -> x+1);
        s.skip(10).limit(3).forEach((x)->{System.out.println("Here is: " + x);});
    }
}
