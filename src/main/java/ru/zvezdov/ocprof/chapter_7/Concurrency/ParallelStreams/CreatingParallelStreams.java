package ru.zvezdov.ocprof.chapter_7.Concurrency.ParallelStreams;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author Dmitry Zvezdov
 *         18.04.17.
 */
public class CreatingParallelStreams {
    public static void main(String[] args) {
        // parallel()
        Stream<Integer> stream = Arrays.asList(1,2,3,4,5,6).stream();
        Stream<Integer> parallelStream = stream.parallel();
        System.out.println(parallelStream.isParallel());

        // parallelStream()
        Stream<Integer> parallerStream2 = Arrays.asList(1,2,3,4,5,6,7).parallelStream();
    }
}
