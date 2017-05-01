package ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Collections.MyMap;

import ru.zvezdov.ocprof.chapter_1.AdvancedClassDesign.Object.MyObject;
import ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Collections.MyCollection.MyCollection;
import ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Collections.MyCollection.MySet;

/**
 * @author Dmitry Zvezdov
 *         25.04.17.
 */
public interface MyMap<K, V> {
    int size();
    boolean isEmpty();
    boolean containsKey(MyObject key);
    boolean containsValue(MyObject value);

    V get(MyObject key);
    V put(MyObject key, MyObject value);
    V remove(MyObject key);

    void putAll(MyMap<? extends K, ? extends V> m);
    void clear();

    MySet<K> keySet();
    MyCollection<V> values();
    MySet<MyMap.Entry<K, V>> entrySet();

    interface Entry<K, V> {
        K getKey();
        V getValue();
        V setValue(V value);
        boolean equals(MyObject var1);
        int hashCode();

    }

    boolean equals(MyObject var1);
    int hashCode();


}
