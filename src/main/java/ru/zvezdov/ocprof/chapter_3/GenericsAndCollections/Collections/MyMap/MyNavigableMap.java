package ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Collections.MyMap;

import ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Collections.MyCollection.MyNavigableSet;

import java.util.NavigableMap;
import java.util.NavigableSet;

/**
 * @author Dmitry Zvezdov
 *         25.04.17.
 */
public interface MyNavigableMap<K, V> extends MySortedMap<K, V> {
    MyMap.Entry<K, V> lowerEntry();
    K lowerKey();

    MyMap.Entry<K, V> floorEntry();
    K floorKey();

    MyMap.Entry<K, V> ceilingEntry();
    K ceilingKey();

    MyMap.Entry<K, V> higherEntry();
    K higherKey();

    MyMap.Entry<K, V> firstEntry();
    MyMap.Entry<K, V> lastEntry();
    MyMap.Entry<K, V> pollFirstEntry();
    MyMap.Entry<K, V> pollLastEntry();

    MyNavigableMap<K, V> descendingMap();
    MyNavigableSet<K> navigableKeySet();
    MyNavigableSet<K> descendingKeySet();

    MyNavigableMap<K, V> subMap(K keyFrom, boolean inclusiveFrom,
                                K keyTo, boolean inclusiveTo);
    MyNavigableMap<K, V> headMap(K keyTo, boolean inclusive);
    MyNavigableMap<K, V> tailMap(K keyFrom, boolean inclusive);

    MySortedMap<K, V> subMap(K keyFrom, K keyTo);
    MySortedMap<K, V> headMap(K keyTo);
    MySortedMap<K, V> tailMAp(K keyFrom);
}
