package ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Collections.ComparableVsComparator.Java8Additions.RemovingConditionally;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dmitry Zvezdov
 *         13.04.17.
 *
 *         boolean removeIf(Predicate<? super E> filter)
 *
 *
 */
public class RemoveIf {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Magician");
        list.add("Assistant");
        System.out.println(list);

        list.removeIf(s -> s.startsWith("A"));
        System.out.println(list);

    }
}
