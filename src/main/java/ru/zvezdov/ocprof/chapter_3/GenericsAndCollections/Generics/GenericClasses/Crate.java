package ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Generics.GenericClasses;

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
public class Crate<T> {
    private T contents;
    public T emptyCrate(){
        return contents;
    }

    public void packCrate(T contents){
        this.contents = contents;
    }

}
