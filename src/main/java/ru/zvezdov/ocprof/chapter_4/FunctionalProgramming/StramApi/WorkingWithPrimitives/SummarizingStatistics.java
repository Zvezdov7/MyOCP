package ru.zvezdov.ocprof.chapter_4.FunctionalProgramming.StramApi.WorkingWithPrimitives;

import java.util.IntSummaryStatistics;
import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * @author Dmitry Zvezdov
 *         14.04.17.
 */
public class SummarizingStatistics {
    public static void main(String[] args) {
        OptionalInt optionalInt = IntStream.of(1,2,3,4).max();

        IntSummaryStatistics statistics = IntStream.of(1,3,2,4,1).summaryStatistics();
        System.out.println(statistics.getMax());
        System.out.println(statistics.getCount());
        System.out.println(statistics.getSum());
    }
}
