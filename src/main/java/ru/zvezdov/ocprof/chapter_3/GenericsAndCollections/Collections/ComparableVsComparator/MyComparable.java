package ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Collections.ComparableVsComparator;

/**
 * @author Dmitry Zvezdov
 *         27.04.17.
 */
public interface MyComparable<T> {
    int compareTo(T o);
}
