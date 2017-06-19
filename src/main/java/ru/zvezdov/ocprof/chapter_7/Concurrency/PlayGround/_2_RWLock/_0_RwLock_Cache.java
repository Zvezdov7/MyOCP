package ru.zvezdov.ocprof.chapter_7.Concurrency.PlayGround._2_RWLock;

import ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Collections.MyMap.MyMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author Dmitry Zvezdov
 *         09.06.17.
 */
public class _0_RwLock_Cache {

    private Map<Integer, String> map = new ConcurrentHashMap<>(1024, 0.75f, 4);

    public synchronized String get(Object key) {
        return map.get(key);
    }

    public synchronized String put(Integer key, String value) {
        return map.put(key, value);
    }

    public <K, V> Map<K, V> rwSyncMap(Map<K, V> m){
        return new MyMap<K, V>(m);
    }




    private static class MyMap<K, V> implements Map<K, V> {
        private final ReadWriteLock rwLock = new ReentrantReadWriteLock();
        private final Lock rLock = rwLock.readLock();
        private final  Lock wLock = rwLock.writeLock();
        private final Map<K, V> m;

        public MyMap(Map<K, V> m) {
            this.m = m;
        }

        @Override
        public int size() {
            rLock.lock();
            try {
                return m.size();
            } finally {
                rLock.unlock();
            }
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean containsKey(Object key) {
            return false;
        }

        @Override
        public boolean containsValue(Object value) {
            return false;
        }

        @Override
        public V get(Object key) {
            return null;
        }

        @Override
        public V put(K key, V value) {
            wLock.lock();
            try {
                return m.put(key, value );
            } finally {
                wLock.unlock();
            }
        }

        @Override
        public V remove(Object key) {
            return null;
        }

        @Override
        public void putAll(Map<? extends K, ? extends V> m) {

        }

        @Override
        public void clear() {

        }

        @Override
        public Set<K> keySet() {
            return null;
        }

        @Override
        public Collection<V> values() {
            return null;
        }

        @Override
        public Set<Entry<K, V>> entrySet() {
            return null;
        }
    }
}
