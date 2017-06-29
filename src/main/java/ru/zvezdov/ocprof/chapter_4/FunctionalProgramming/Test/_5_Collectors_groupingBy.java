package ru.zvezdov.ocprof.chapter_4.FunctionalProgramming.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Dmitry on 26.06.2017.
 */
public class _5_Collectors_groupingBy {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("j", " ", "a", "v", "a", " " , "!");
//        Map<Integer, List<String>> collect = list.stream().collect(Collectors.groupingBy(String::length));
        Map<Integer, List<String>> collect = list.stream().collect(Collectors.groupingBy(String::length, Collectors.mapping(o -> {return o.toUpperCase();}, Collectors.toList())));
        System.out.println(collect);
    }
}
