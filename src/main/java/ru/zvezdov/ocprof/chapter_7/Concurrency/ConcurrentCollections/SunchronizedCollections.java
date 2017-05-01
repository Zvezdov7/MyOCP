package ru.zvezdov.ocprof.chapter_7.Concurrency.ConcurrentCollections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Dmitry Zvezdov
 *         18.04.17.
 */
public class SunchronizedCollections {
    public static void main(String[] args) {
        Map<String, Object> foodData = new HashMap<>();
        foodData.put("penguin", 1);
        foodData.put("flamingo", 2);
        Map<String, Object> synchronizedFoodData = Collections.synchronizedMap(foodData);
        for (String key : synchronizedFoodData.keySet()) {
//            synchronizedFoodData.remove(key); // ConcurrentModificationException
        }
    }
}
