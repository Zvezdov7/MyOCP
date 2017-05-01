package ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Collections.MyCollection;

import ru.zvezdov.ocprof.chapter_1.AdvancedClassDesign.Object.MyObject;

import java.util.Iterator;

/**
 * @author Dmitry Zvezdov
 *         25.04.17.
 */
public interface MySet<E> extends MyCollection<E> {
    int size();
    boolean isEmpty();
    boolean contains(MyObject var1);
    boolean containsAll(MyCollection<?> var1);

    void clear();
    boolean add(E var1);
    boolean remove(MyObject var1);
    boolean addAll(MyCollection<? extends E> var1);
    boolean removeAll(MyCollection<?> var1);
    boolean retainAll(MyCollection<?> var1);

    int hashCode();
    boolean equals(MyObject var1);

    Iterator<E> iterator();
    MyObject[] toArray();
    <E> E[] toArray(E[] var1);




}
