package ru.zvezdov.ocprof.chapter_4.FunctionalProgramming.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Dmitry on 20.06.2017.
 */
public class _4_Collectors_joining {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("j", "a", "v", "a");
//        String collect = list.stream().collect(Collectors.joining());
        String collect = list.stream().collect(Collectors.joining(" ", "+", "-"));
        System.out.println(collect);
    }
}
