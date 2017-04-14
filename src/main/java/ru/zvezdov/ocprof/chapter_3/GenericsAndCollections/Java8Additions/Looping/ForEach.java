package ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Java8Additions.Looping;

import java.util.Arrays;
import java.util.List;

/**
 * @author Dmitry Zvezdov
 *         13.04.17.
 */
public class ForEach {
    public static void main(String[] args) {
        List<String> cats = Arrays.asList("Annie", "Ripley");
        for (String cat : cats) {
            System.out.println(cat);
        }
        cats.forEach(c -> System.out.println(c));
        cats.forEach(System.out::println);

    }
}
