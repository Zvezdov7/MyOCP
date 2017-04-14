package ru.zvezdov.ocprof.chapter_4.FunctionalProgramming.BuiltInFunctionalInterfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * @author Dmitry Zvezdov
 *         13.04.17.
 */
public class Consumer_FI {
    public static void main(String[] args) {
        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = (x) -> System.out.println(x);

        c1.accept("Hello");
        c2.accept("World");

        Map<String, Integer> map = new HashMap<>();
        BiConsumer<String, Integer> c3 = map::put;
        BiConsumer<String, Integer> c4 = (k, v) -> map.put(k, v);

        c3.accept("Yolandi", 1);
        c4.accept("Ninja", 1);

        System.out.println(map);



    }


}
