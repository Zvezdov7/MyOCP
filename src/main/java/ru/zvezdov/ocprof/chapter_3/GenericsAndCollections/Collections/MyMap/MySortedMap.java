package ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Collections.MyMap;

import ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Collections.MyCollection.MyCollection;
import ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Collections.MyCollection.MySet;

import java.util.Comparator;

/**
 * @author Dmitry Zvezdov
 *         25.04.17.
 */
public interface MySortedMap<K, V> extends MyMap<K, V> {
    Comparator<? super K> comparator();
    MySortedMap<K, V> subMap(K keyFrom, K keyTo);
    MySortedMap<K, V> headMap(K keyTo);
    MySortedMap<K, V> tailMAp(K keyFrom);
    K firstKey();
    K lastKey();
    MySet<K> keySet();
    MyCollection<V> values();
    MySet<Entry<K, V>> entrySet();
}
