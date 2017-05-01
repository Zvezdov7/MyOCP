package ru.zvezdov.ocprof.chapter_7.Concurrency.ConcurrentCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Dmitry Zvezdov
 *         18.04.17.
 */
public class MemoryConsistencyErrors {
    public static void main(String[] args) {
//        Map<String, Object> foodData = new HashMap<>();
        Map<String, Object> foodData = new ConcurrentHashMap<>();
        foodData.put("penguin", 1);
        foodData.put("flamingo", 2);
        for (String key : foodData.keySet()) {
            foodData.remove(key);
        }

    }
}
