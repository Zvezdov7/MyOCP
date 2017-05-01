package ru.zvezdov.ocprof.chapter_7.Concurrency.ConcurrentCollections;


import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Dmitry Zvezdov
 *         18.04.17.
 */
public class ZooManager {
//    private Map<String, Object> foodData = new HashMap<>();
    private  Map<String, Object> foodData = new ConcurrentHashMap<>();
//    public synchronized void put(String key, String value){
    public void put(String key, String value){
        foodData.put(key, value);
    }
//    public synchronized Object get(String key){
    public Object get(String key){
        return foodData.get(key);
    }
}
