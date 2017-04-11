package ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Collections.List.commonMethods;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dmitry Zvezdov
 *         11.04.17.
 */
public class Methods {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println(list.add("SD"));
//        System.out.println(list.add(0, "NY")); //Doesn't compile - void
        list.add(0, "NY");
        System.out.println(list.set(1, "FL"));

        System.out.println(list.remove("NY"));
        System.out.println(list.remove(0));

//        String state = list.get(0); // RuntimeException
        int index = list.indexOf("NY");
        System.out.println(index);
    }
}
