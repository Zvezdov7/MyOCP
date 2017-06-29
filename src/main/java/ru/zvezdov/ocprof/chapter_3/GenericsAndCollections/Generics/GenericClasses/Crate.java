package ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Generics.GenericClasses;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Dmitry Zvezdov
 *         11.04.17.
 *
 *         E for an element
 *         K for a map key
 *         V for a map value
 *         N for a number
 *         T for a generic data type
 *         S, U, V, and so forth for multiple generic types
 *
 */
public class Crate<T extends Number> {
    private T contents;
    public T emptyCrate(){
        return contents;
    }

    public Crate() {
    }

    public Crate(T contents) {
        this.contents = contents;
    }

    public void packCrate(T contents){
        this.contents = contents;
    }

    public static void main(String[] args) {
    }
}

