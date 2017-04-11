package ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Generics.GenericMethods;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dmitry Zvezdov
 *         11.04.17.
 */
public class LegacyAutoboxing {
    public static void main(String[] args) {
        List numbers = new ArrayList();
        numbers.add(5);
//        int result = numbers.get(0); //Doesn't compile
    }
}
