package ru.zvezdov.ocprof.chapter_4.FunctionalProgramming.PlayGround;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

/**
 * @author Dmitry Zvezdov
 *         09.06.17.
 */
public class _0_InitStreams {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.empty(); // Empty stream
        Stream<Integer> stream2 = Arrays.asList(1, 2, 3).stream(); // Stream from List
        Stream<Integer> stream3 = Stream.concat(stream1, stream2); // Stream from the first two streams
        Stream<Integer> stream4 = Stream.of(1, 2, 3, 4, 5); // Stream from objects
        Stream<Integer> stream5 = Stream.iterate(0, e -> e++);
        Stream<Integer> stream6 = Stream.generate(() -> 1);

//        stream2.forEach(s -> s++);
//        stream2.forEach(s -> s--);



    }
}
