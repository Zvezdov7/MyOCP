package ru.zvezdov.ocprof.chapter_7.Concurrency.ParallelStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Dmitry Zvezdov
 *         18.04.17.
 */
public class StatefulOperations {
    public static void main(String[] args) {
        List<Integer> data = Collections.synchronizedList(new ArrayList<>());
        Arrays.asList(1,2,3,4,5,6).parallelStream()
                .map(i -> {data.add(i); return i;})
                .forEachOrdered(System.out::println);

        System.out.println();
        for (Integer e : data) {
            System.out.print(e +" ");
        }
    }
}
