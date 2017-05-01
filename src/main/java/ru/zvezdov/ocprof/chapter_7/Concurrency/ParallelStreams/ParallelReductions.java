package ru.zvezdov.ocprof.chapter_7.Concurrency.ParallelStreams;

import java.util.Arrays;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Dmitry Zvezdov
 *         19.04.17.
 */
public class ParallelReductions {
    public static void main(String[] args) {
        System.out.println(Arrays.asList(1,2,3,4,5,6).stream().findAny().get());
        System.out.println(Arrays.asList(1,2,3,4,5,6).parallelStream().findAny().get());

        System.out.println(Arrays.asList("w", "o", "l", "f").stream().reduce("", (s, s1) -> s = s+s1, (s2, s3) -> s2 + s3));

        Stream<String> stringStream = Stream.of("w", "o", "l", "f").parallel();
        SortedSet<String> set = stringStream.collect(ConcurrentSkipListSet::new, Set::add, Set::addAll);
        System.out.println(set);

        Stream<String> stringStream1 = Stream.of("w", "o", "l", "f").parallel();
        Set<String> set1= stringStream1.collect(Collectors.toSet());
        System.out.println(set1);

    }
}
