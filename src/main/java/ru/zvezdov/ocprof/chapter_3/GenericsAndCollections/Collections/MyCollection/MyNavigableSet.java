package ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Collections.MyCollection;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

/**
 * @author Dmitry Zvezdov
 *         25.04.17.
 */
public interface MyNavigableSet<E> extends MySortedSet<E> {
    E lower(E e);
    E floor(E e);

    E ceiling(E e);
    E higher(E e);

    E pollFirst();
    E pollLast();
    Iterator<E> iterator();
    NavigableSet<E> descendingSet();
    Iterator<E> descendingIterator();

    NavigableSet<E> subSet(E fromElement, boolean fromInclusive,
                           E toElement, boolean toInclusive);

    NavigableSet<E> headSet(E toElement, boolean toInclusive);
    NavigableSet<E> tailSet(E fromElement, boolean fromInclusive);

    SortedSet<E> subSet(E fromElement, E toElement);
    SortedSet<E> headSet(E toElement);
    SortedSet<E> tailSet(E fromElement);
}
