package ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Generics.GenericMethods;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dmitry Zvezdov
 *         11.04.17.
 */
public class LegacyDragons {
    public static void main(String[] args) {
        List unicorns = new ArrayList();
        unicorns.add(new Unicorn());
        pringDragons(unicorns);


    }

    private static void pringDragons(List<Dragon> dragons){
        for (Dragon dragon : dragons) { // ClassCastException
            System.out.println(dragon);
        }
    }
}
