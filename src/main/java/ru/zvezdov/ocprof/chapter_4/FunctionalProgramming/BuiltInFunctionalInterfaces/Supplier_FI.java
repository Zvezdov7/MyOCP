package ru.zvezdov.ocprof.chapter_4.FunctionalProgramming.BuiltInFunctionalInterfaces;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;

/**
 * @author Dmitry Zvezdov
 *         13.04.17.
 */
public class Supplier_FI {
    public static void main(String[] args) {
        Supplier<LocalDate> s1 = LocalDate::now;
        Supplier<LocalDate> s2 = () -> LocalDate.now();

        LocalDate d1 = s1.get();
        LocalDate d2 = s2.get();

        System.out.println(d1);
        System.out.println(d2);

        Supplier<StringBuilder> s3 = StringBuilder::new;
        Supplier<StringBuilder> s4 = () -> new StringBuilder();

        System.out.println(s3.get());
        System.out.println(s4.get());

        Supplier<ArrayList<String>> s5 = ArrayList::new;
        ArrayList<String> arrayList = s5.get();
        System.out.println(arrayList);


    }
}
