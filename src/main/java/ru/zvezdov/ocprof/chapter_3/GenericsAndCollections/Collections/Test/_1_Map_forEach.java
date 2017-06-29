package ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Collections.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Dmitry on 20.06.2017.
 */
public class _1_Map_forEach {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("1", 1);
        map.put("2", 2);
        map.put("3", 3);

        map.forEach((k, v) -> System.out.println(k + " " + v));
    }

}
