package ru.zvezdov.ocprof.chapter_4.FunctionalProgramming.StramApi.CommonTerminalOperations;

import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Dmitry Zvezdov
 *         13.04.17.
 */
public class Collect {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("B", "i", "n", "g", "o");
        stream.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);

        Stream<String> stream1 = Stream.of("B", "r", "a", "n", "c", "h");
        TreeSet<String> strings = stream1.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
        System.out.println(strings);


        Stream<String> stream2 = stream;
        TreeSet<String> strings2 = stream2.collect(Collectors.toCollection(TreeSet::new));


    }
}
