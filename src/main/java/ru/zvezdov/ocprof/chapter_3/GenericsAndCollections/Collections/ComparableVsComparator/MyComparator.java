package ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Collections.ComparableVsComparator;

import ru.zvezdov.ocprof.chapter_1.AdvancedClassDesign.Object.MyObject;

/**
 * @author Dmitry Zvezdov
 *         27.04.17.
 */
public interface MyComparator<T> {
    int compare(T o1, T o2);
    boolean equals(MyObject object);
}
