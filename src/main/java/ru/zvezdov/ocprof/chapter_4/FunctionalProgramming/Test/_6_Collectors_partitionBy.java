package ru.zvezdov.ocprof.chapter_4.FunctionalProgramming.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Dmitry on 26.06.2017.
 */
public class _6_Collectors_partitionBy {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("J", "a", " ", "v", "a", " ", "!");
        Map<Boolean, List<String>> collect = list.stream().collect(Collectors.partitioningBy(o -> {
            return o.equals(" ");
        }));
        System.out.println(collect);

    }
}
