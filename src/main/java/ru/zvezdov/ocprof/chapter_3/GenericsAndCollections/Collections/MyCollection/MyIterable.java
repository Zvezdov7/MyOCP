package ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Collections.MyCollection;

import java.util.Iterator;

/**
 * @author Dmitry Zvezdov
 *         25.04.17.
 */
public interface MyIterable<T> {
    Iterator<T> iterator();


}
