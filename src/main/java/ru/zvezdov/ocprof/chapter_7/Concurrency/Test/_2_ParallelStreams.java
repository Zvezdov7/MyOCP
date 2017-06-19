package ru.zvezdov.ocprof.chapter_7.Concurrency.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Dmitry Zvezdov
 *         13.06.17.
 */
public class _2_ParallelStreams {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b");
        String reduce = list.parallelStream().reduce("_", (a, b) -> a.concat(b));
        System.out.println(reduce);

    }
}
