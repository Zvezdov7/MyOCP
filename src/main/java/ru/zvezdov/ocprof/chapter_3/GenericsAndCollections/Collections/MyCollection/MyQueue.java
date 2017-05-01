package ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Collections.MyCollection;

/**
 * @author Dmitry Zvezdov
 *         25.04.17.
 */
public interface MyQueue<E> extends MyCollection<E> {
    boolean add(E var1);
    boolean offer(E var1);

    E remove();
    E poll();

    E element();
    E peek();

}
