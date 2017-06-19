package ru.zvezdov.ocprof.chapter_4.FunctionalProgramming.StramApi.CommonTerminalOperations;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

/**
 * @author Dmitry Zvezdov
 *         13.04.17.
 */
public class Reduce {
    public static void main(String[] args) {
        String[] array = new String[]{"H", "i", ", " , "b", "r", "o!"};
        String result = "";
        for (String s : array) {
            result += s;
        }
        System.out.println(result);

        Stream<String> stringStream = Stream.of("W", "h", "a", "t", "'", "s", " up?");
        final String reduce = stringStream.reduce("", (s, c) -> 2 > 1 ? s : c );
        System.out.println(reduce);

        Stream<Integer> stream = Stream.of(3, 5, 6);
        System.out.println(stream.reduce(1, (a, b) -> a * b));

        BinaryOperator<Integer> op = (a, b) -> a * b;
        Stream<Integer> empty = Stream.empty();
        Stream<Integer> oneElement = Stream.of(3);
        Stream<Integer> threeElements = Stream.of(3, 5, 6);

        empty.reduce(op).ifPresent(System.out::println); // none
        oneElement.reduce(op).ifPresent(System.out::println); // 3
        threeElements.reduce(op).ifPresent(System.out::println); // 90

    }
}
