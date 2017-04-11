package ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Generics.GenericInterfaces;

/**
 * @author Dmitry Zvezdov
 *         11.04.17.
 */
public class ShippableAbstractCrate<U> implements Shippable<U> {
    @Override
    public void ship(U u) {

    }
}
