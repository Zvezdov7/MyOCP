package ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Collections.MyCollection;

import ru.zvezdov.ocprof.chapter_1.AdvancedClassDesign.Object.MyObject;

import java.util.SortedSet;

/**
 * @author Dmitry Zvezdov
 *         25.04.17.
 */
public interface MySortedSet<E> extends MySet<E> {
    Comparable<? super E> comparator();
    boolean compareTo(MyObject var1);
    SortedSet<E> subSet(E fromElement, E toElement);
    SortedSet<E> headSet(E toElement);
    SortedSet<E> tailSet(E fromElement);

    E first();
    E last();


}
