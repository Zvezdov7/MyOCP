package ru.zvezdov.ocprof.chapter_1.AdvancedClassDesign.Test;

import java.util.Arrays;
import java.util.Deque;

/**
 * @author Dmitry Zvezdov
 *         13.06.17.
 */
public class _0_ComparableVsLambdas {
    public static void main(String[] args) {
        Integer[] arr = {1, 6, 4};
        Arrays.sort(arr, new _0_ComparableVsLambdas()::d);

    }

    int d(int a, int b) {return 0;}
}
