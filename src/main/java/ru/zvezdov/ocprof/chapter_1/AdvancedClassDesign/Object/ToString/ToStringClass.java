package ru.zvezdov.ocprof.chapter_1.AdvancedClassDesign.Object.ToString;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Dmitry Zvezdov
 *         07.04.17.
 */
public class ToStringClass {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(new Integer[]{1, 2, 3, 4, 5}));
        System.out.println(list);
        System.out.println(new ArrayList<Integer>(Arrays.asList(1,2,3,4)));
        System.out.println(new String[] {"Ben", "John", "Den"});
    }
}
