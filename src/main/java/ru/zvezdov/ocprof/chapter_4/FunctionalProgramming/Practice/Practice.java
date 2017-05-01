package ru.zvezdov.ocprof.chapter_4.FunctionalProgramming.Practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author Dmitry Zvezdov
 *         27.04.17.
 */
public class Practice {
    public static void main(String[] args) {
        Supplier<String> stringSupplier = String::new;
        Supplier<String> stringSupplier1 = () -> { return String.valueOf(System.currentTimeMillis());};
        Supplier<Long> longSupplier = System::currentTimeMillis;

        System.out.println(stringSupplier.get());
        System.out.println(stringSupplier1.get());
        System.out.println(longSupplier.get()
        );

        Supplier<Double> doubleSupplier = Math::random;
        System.out.println(doubleSupplier.get());

        Consumer<String> stringConsumer = System.out::println;
        stringConsumer.accept("Hahaha");
        stringConsumer.accept(stringSupplier1.get());

        String[] arr = new String[]{"1", "2", "3", "4", "5"};
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(arr));
        Function<Integer, String> integerStringFunction = arrayList::get;
        System.out.println(integerStringFunction.apply(1));

    }
}
