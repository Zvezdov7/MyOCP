package ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Collections.MyCollection;

import ru.zvezdov.ocprof.chapter_1.AdvancedClassDesign.Object.MyObject;

import java.util.Iterator;

/**
 * @author Dmitry Zvezdov
 *         25.04.17.
 */
public interface MyDeque<E> extends MyQueue<E> {
    boolean addFirst(E var1);
    boolean addLast(E var1);

    boolean offerFirst(E var1);
    boolean offerLast(E var1);

    E removeFirst();
    E removeLast();

    E pollFirst();
    E pollLast();

    E getFirst();
    E getLast();

    E peekFirst();
    E peekLast();

    boolean removeFirstOccurrence(MyObject var1);
    boolean removeLastOccurrence(MyObject var1);

    boolean add(E var1);
    boolean offer(E var1);

    E remove();
    E poll();

    E element();
    E peek();

    void push(E var1);
    E pop();

    boolean remove(MyObject o);
    boolean contains(MyObject o);
    int size();
    Iterator<E> iterator();
    Iterator<E> descendingIterator();

}
