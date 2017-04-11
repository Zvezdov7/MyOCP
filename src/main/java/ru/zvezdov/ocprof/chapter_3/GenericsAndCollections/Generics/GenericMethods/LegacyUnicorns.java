package ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Generics.GenericMethods;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dmitry Zvezdov
 *         11.04.17.
 */
public class LegacyUnicorns {
    public static void main(String[] args) {
        List<Unicorn> unicorns = new ArrayList<>();
        addUnicorn(unicorns);
        Unicorn unicorn = unicorns.get(0); // ClassCastException
    }

    private static void addUnicorn(List unicorn) {
        unicorn.add(new Dragon());
    }
}
