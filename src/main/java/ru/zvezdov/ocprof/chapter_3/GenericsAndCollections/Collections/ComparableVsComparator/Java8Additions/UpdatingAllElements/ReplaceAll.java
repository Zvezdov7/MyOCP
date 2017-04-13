package ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Collections.ComparableVsComparator.Java8Additions.UpdatingAllElements;

import java.util.Arrays;
import java.util.List;

/**
 * @author Dmitry Zvezdov
 *         13.04.17.
 *
 *         void replaceAll(UnaryOperator<E> o)
 *
 *         UnaryOperator - identity
 *
 */
public class ReplaceAll {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.replaceAll(x -> x*2);
        System.out.println(list);
    }
}
