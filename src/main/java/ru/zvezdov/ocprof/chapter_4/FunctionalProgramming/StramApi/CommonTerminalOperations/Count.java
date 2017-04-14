package ru.zvezdov.ocprof.chapter_4.FunctionalProgramming.StramApi.CommonTerminalOperations;

import java.util.stream.Stream;

/**
 * @author Dmitry Zvezdov
 *         13.04.17.
 */
public class Count {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        System.out.println(s.count());

//        Stream<Double> s1 = Stream.generate(Math::random);
//        System.out.println(s1.count()); Funky



    }
}
