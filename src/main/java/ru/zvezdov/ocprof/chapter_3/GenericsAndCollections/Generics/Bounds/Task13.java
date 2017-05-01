package ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Generics.Bounds;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dmitry Zvezdov
 *         24.04.17.
 */
public class Task13 {
    public static void main(String[] args) {
        List<?> list = new ArrayList<String>();
//        list.add(new Integer(1));
        list.add(null);
        list.add(null);
//        list.add(1);
//        list.add("222");
//        list.add(new Object());
        System.out.println(list.size());

        List<? super Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        System.out.println(list1.get(0));
    }
}
