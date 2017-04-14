package ru.zvezdov.ocprof.chapter_4.FunctionalProgramming.BuiltInFunctionalInterfaces;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author Dmitry Zvezdov
 *         13.04.17.
 */
public class Function_FI {
    public static void main(String[] args) {
        Function<String, Integer> f1 = String::length;
        Function<String, Integer> f2 = (s) -> s.length();

        System.out.println(f1.apply("Clock"));
        System.out.println(f2.apply("Block"));

        BiFunction<String, String, String> b1 = String::concat;
        BiFunction<String, String, String> b2 = (a, b) -> a.concat(b);

        System.out.println(b1.apply("Hey", " Bro"));
        System.out.println(b2.apply("What's", " Up?"));
    }
}
