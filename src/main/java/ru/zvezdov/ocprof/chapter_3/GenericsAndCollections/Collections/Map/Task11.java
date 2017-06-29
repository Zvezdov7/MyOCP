package ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Collections.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Dmitry Zvezdov
 *         24.04.17.
 */
public class Task11 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>(10);
        for (int i = 0; i < 20; i++) {
            map.put(i, i);
        }
        System.out.println(map);
        System.out.println(map.get(10));


        Map mapp = new HashMap();
        mapp.put(1, new Integer(1));
        mapp.put("1", new ArrayList());
        mapp.put(1.0, new ArrayList());
        System.out.println(mapp);

    }
}
