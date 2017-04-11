package ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Generics.GenericMethods;

/**
 * @author Dmitry Zvezdov
 *         11.04.17.
 */
public class Crate<T> {

    public static <T> Crate<T> shup(T t){
        System.out.println("Preparing " + t);
        return new Crate<T>();
    }
}
