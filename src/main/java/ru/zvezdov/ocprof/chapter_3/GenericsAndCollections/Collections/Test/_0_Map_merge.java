package ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Collections.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Dmitry on 20.06.2017.
 */
public class _0_Map_merge {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.merge(1, "b", (a, b) -> b);
        System.out.println(map);
    }
}
