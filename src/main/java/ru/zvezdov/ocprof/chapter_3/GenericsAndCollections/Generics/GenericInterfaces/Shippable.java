package ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Generics.GenericInterfaces;

/**
 * @author Dmitry Zvezdov
 *         11.04.17.
 */
public interface Shippable <T> {
    void ship(T t);
}
