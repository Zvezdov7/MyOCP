package ru.zvezdov.ocprof.chapter_4.FunctionalProgramming.BuiltInFunctionalInterfaces;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 * @author Dmitry Zvezdov
 *         13.04.17.
 */
public class Predicate_FI {
    public static void main(String[] args) {

        String str = "Dimaaa";

        Predicate<String> p1 = str::startsWith;
        Predicate<String> p2 = (s) -> str.startsWith(s);

        System.out.println(p1.test("d"));
        System.out.println(p2.test("d"));

        BiPredicate<String, String> p3 = String::startsWith;
        BiPredicate<String, String> p4 = (s1, s2) -> s1.startsWith(s2);

        System.out.println(p3.test("Hello", "H"));
        System.out.println(p4.test("Hello", "Helloa"));
    }
}
