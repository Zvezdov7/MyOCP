package ru.zvezdov.ocprof.chapter_4.FunctionalProgramming.PlayGround;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Dmitry on 20.06.2017.
 */
public class _1_reduceElements {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);

//        double sum = list.stream().sum;
//        double sum = list.stream().mapToInt(x -> x).sum(); // Correct
        double sum = list.stream().reduce(0, (a, b) -> a = a+b); // Correct
//        double sum = 0;
//        list.stream().forEach(x -> {sum = sum + x;}); // Compilation Error (Lambda should be final or effectively final)
//        list.stream().peek(x -> sum = sum + x).forEach(); // Compilation Error (Same problem)
        System.out.println(sum);
    }
}
