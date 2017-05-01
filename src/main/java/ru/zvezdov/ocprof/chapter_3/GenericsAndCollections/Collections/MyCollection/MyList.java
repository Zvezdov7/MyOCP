package ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Collections.MyCollection;

import ru.zvezdov.ocprof.chapter_1.AdvancedClassDesign.Object.MyObject;

import java.util.Iterator;
import java.util.ListIterator;

/**
 * @author Dmitry Zvezdov
 *         25.04.17.
 */
public interface MyList<E> extends MyCollection<E>{
    int size();
    boolean isEmpty();
    boolean contains(MyObject var1);
    boolean containsAll(MyCollection<?> var1);

    boolean add(E var1);
    boolean remove(MyObject var1);
    boolean addAll(MyCollection<? extends E> var1);
    boolean removeAll(MyCollection<?> var1);
    boolean retainAll(MyCollection<?> var1);
    void clear();
    int hashCode();
    boolean equals(MyObject var1);

    Iterator<E> iterator();
    MyObject[] toArray();
    <T> T[] toArray(T[] var1);

    E get(int index);
    E set(int index);
    void add(int index, E element);
    E remove(int index);

    int indexOf(MyObject var1);
    int lastIndexOf(MyObject var1);

    ListIterator<E> listIterator();
    ListIterator<E> listIterator(int index);

    MyList<E> subList(int indexFrom, int indexTo);
}
