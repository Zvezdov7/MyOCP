package ru.zvezdov.ocprof.chapter_4.FunctionalProgramming.BuiltInFunctionalInterfaces;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

/**
 * @author Dmitry Zvezdov
 *         13.04.17.
 */
public class Operator_FI {
    public static void main(String[] args) {
        UnaryOperator<String> u1 = String::toUpperCase;
        UnaryOperator<String> u2 = s -> s.toUpperCase();

        System.out.println(u1.apply("yoyolow"));
        System.out.println(u2.apply("yoyohigh"));

        BinaryOperator<String> b1 = String::concat;
        BinaryOperator<String> b2 = (s1, s2) -> s1.concat(s2);

        System.out.println(b1.apply("s", "s"));
        System.out.println(b2.apply("a", "a"));


    }
}
