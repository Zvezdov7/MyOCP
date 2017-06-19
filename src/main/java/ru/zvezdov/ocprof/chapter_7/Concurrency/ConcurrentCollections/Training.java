package ru.zvezdov.ocprof.chapter_7.Concurrency.ConcurrentCollections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Dmitry Zvezdov
 *         02.06.17.
 */
public class Training {
    public static void main(String[] args) {
        Map<String, Object> stringObjectHashMap = new ConcurrentHashMap<>();
        stringObjectHashMap.put("1", 1);
        stringObjectHashMap.put("2", 2);
        System.out.println(stringObjectHashMap);
        for (String string : stringObjectHashMap.keySet()) {
            stringObjectHashMap.remove(string);
            System.out.println(stringObjectHashMap);
        }
        System.out.println(stringObjectHashMap);
    }
}
