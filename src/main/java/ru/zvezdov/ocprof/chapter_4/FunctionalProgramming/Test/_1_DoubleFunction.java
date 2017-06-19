package ru.zvezdov.ocprof.chapter_4.FunctionalProgramming.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleFunction;
import java.util.function.ToDoubleFunction;

/**
 * @author Dmitry Zvezdov
 *         13.06.17.
 */
public class _1_DoubleFunction {
    public static void main(String[] args) {
        List<Double> doubles = Arrays.asList(11.0, 23.0);
        DoubleFunction function = x -> x+10;
        ToDoubleFunction toDoubleFunction = null;
        doubles.stream().mapToDouble(toDoubleFunction);
    }
}
