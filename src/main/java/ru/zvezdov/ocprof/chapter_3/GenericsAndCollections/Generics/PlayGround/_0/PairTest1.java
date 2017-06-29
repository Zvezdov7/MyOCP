package ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Generics.PlayGround._0;
import ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Generics.PlayGround.*;
/**
 * Created by Dmitry on 19.06.2017.
 */
public class PairTest1 {
    public static void main(String[] args) {
//        String middle = ArrayAlg.getMiddle("1", "2", "3");
//        String middle = ArrayAlg.<String>getMiddle("1", "2", "3");
        double middle = ArrayAlg.getMiddle(0.3, 1.1, 123.12);
        System.out.println(middle);
    }
}

class ArrayAlg {
    public static _0_Pair_SimpleGeneric<String> minmax(String[] a) {
        return new _0_Pair_SimpleGeneric<>("", "");
    }

    public static <T> T getMiddle(T... a) {
        return a[a.length / 2];
    }
}

