package ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Generics.GenericClasses;

/**
 * @author Dmitry Zvezdov
 *         11.04.17.
 */
public class SizeLimitedCrate<T, U> {
    private T contents;
    private U sizeLimit;

    public SizeLimitedCrate(T contents, U sizeLimit) {
        this.contents = contents;
        this.sizeLimit = sizeLimit;
    }
}
