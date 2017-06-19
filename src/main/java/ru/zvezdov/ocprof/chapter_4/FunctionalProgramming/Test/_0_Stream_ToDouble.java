package ru.zvezdov.ocprof.chapter_4.FunctionalProgramming.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author Dmitry Zvezdov
 *         13.06.17.
 */
public class _0_Stream_ToDouble {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1", "2", "3");
        double asDouble = list.stream().mapToDouble((a) -> Double.valueOf(a)).average().getAsDouble();
        System.out.println(asDouble);
    }

}
