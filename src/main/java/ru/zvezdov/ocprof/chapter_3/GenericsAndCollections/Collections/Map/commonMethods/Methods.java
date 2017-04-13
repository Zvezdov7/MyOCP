package ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Collections.Map.commonMethods;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Dmitry Zvezdov
 *         12.04.17.
 */
public class Methods {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("koala", "bamboo");
        hashMap.put("lion", "meat");
        hashMap.put("giraffe", "leaf");
        String food = hashMap.get("koala");
        for (String s : hashMap.keySet()) {
            System.out.println(s);
        }

        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("koala", "bamboo");
        treeMap.put("lion", "meat");
        treeMap.put("giraffe","leaf");
        String foof = treeMap.get("koala");
        for (String s : treeMap.keySet()) {
            System.out.println(s);
        }

        System.out.println(treeMap.containsKey("lion"));
        System.out.println(treeMap.containsValue("leaf"));
        System.out.println(treeMap.size());




    }
}
