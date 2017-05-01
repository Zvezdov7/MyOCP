package ru.zvezdov.ocprof.chapter_4.FunctionalProgramming.Practice;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Dmitry Zvezdov
 *         01.05.17.
 */
public class Practice2 {
    public static void main(String[] args) {

        IntStream stream = Arrays.stream(new int[]{1, 3, 2, 4, 5, 7, 5, 6, 23, 2});
        Stream<String> stream1 = Stream.generate(() -> "Ou yeah");

//        stream.forEach(System.out::println);
        Stream<Integer> stream2 = stream.mapToObj(a -> a);
        System.out.println(stream2.count());

//        stream.parallel().forEach(System.out::println);
//        stream1.limit(5).forEach(System.out::println);





    }
}
