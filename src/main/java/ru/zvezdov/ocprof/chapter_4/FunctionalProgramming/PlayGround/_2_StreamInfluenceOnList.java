package ru.zvezdov.ocprof.chapter_4.FunctionalProgramming.PlayGround;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Dmitry on 20.06.2017.
 */
public class _2_StreamInfluenceOnList {
    public static void main(String[] args) {
        List<Double> list = Arrays.asList(11.0, 12.0);
        list.stream().forEach(x -> { x = x+10; });
        list.stream().forEach(System.out::println);
    }
}
