package ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dmitry Zvezdov
 *         11.04.17.
 */
public class PrintNames {
    static void printNames(List list){
        for (int i = 0; i < list.size(); i++) {
             String name = (String)list.get(i);
            System.out.println(name);

        }
    }

    public static void main(String[] args) {
        List names = new ArrayList();
        names.add(new StringBuilder("Webby"));
        printNames(names); //ClassCastException

//        List<String> otherNames = new ArrayList<>();
//        otherNames.add(new StringBuilder("Webby")); // Compilation Error
//        printNames(otherNames);

    }
}
