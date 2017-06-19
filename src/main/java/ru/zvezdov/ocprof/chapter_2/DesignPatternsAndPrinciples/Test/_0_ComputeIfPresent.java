package ru.zvezdov.ocprof.chapter_2.DesignPatternsAndPrinciples.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/**
 * @author Dmitry Zvezdov
 *         13.06.17.
 */
public class _0_ComputeIfPresent {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "a");
        map.put("2", "2");
        map.computeIfPresent("1", (key, value) -> {
            System.out.println(key);
            System.out.println(value);
            return "c";
        });


        System.out.println(map);
    }
}
