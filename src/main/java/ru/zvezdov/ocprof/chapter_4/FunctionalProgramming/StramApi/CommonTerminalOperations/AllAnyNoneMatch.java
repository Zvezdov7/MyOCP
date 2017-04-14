package ru.zvezdov.ocprof.chapter_4.FunctionalProgramming.StramApi.CommonTerminalOperations;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @author Dmitry Zvezdov
 *         13.04.17.
 */
public class AllAnyNoneMatch {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("mon", "2", "chimb");
        Stream<String> infinite = Stream.generate(() -> "chimb");
        Predicate<String> predicate = x -> Character.isLetter(x.charAt(0));
        System.out.println(list.stream().anyMatch(predicate)); // Есть совпадения
        System.out.println(list.stream().allMatch(predicate)); // Все совпадают
        System.out.println(list.stream().noneMatch(predicate)); // Ни один не совпадает
        System.out.println(infinite.anyMatch(predicate)); // true
//        System.out.println(infinite.noneMatch(predicate)); // inf


    }
}
