package ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Java8Additions.MethodReferences;

import ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Collections.ComparableVsComparator.Comparator.Duck;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author Dmitry Zvezdov
 *         13.04.17.
 *
 *         Functional interfaces:   Predicate - test,
 *                                  Consumer - accept,
 *                                  Supplier - get
 *
 */
public class DuckHelper {
    public DuckHelper() {
    }

    public DuckHelper(int i){

    }

    public static int compareByWeight(Duck d1, Duck d2){
        return d1.getWeight() - d2.getWeight();
    }
    public static int compareByName(Duck d1, Duck d2){
        return d1.getName().compareTo(d2.getName());
    }

    public static void main(String[] args) {
//        Comparator<Duck> byWeight = (d1, d2) -> DuckHelper.compareByWeight(d1, d2);
        Comparator<Duck> byWeight = DuckHelper::compareByWeight;

        Consumer<List<Integer>> methodRef1 = Collections::sort;
        Consumer<List<Integer>> lambda = l -> Collections.sort(l);


        String str = "abc";
        Predicate<String> methodRef2 = str::startsWith;
        Predicate<String> lambda2 = s -> str.startsWith(s);

        Predicate<String> methodRef3 = String::isEmpty;
        Predicate<String> lambda3 = s -> s.isEmpty();

        Supplier<ArrayList> methodRef4 = ArrayList::new;
        Supplier<ArrayList> lambda4 = () -> new ArrayList();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);

        Predicate<Integer> predicate = (l) -> list.isEmpty();
//        Predicate<Integer> predicate1 = list::isEmpty;


        Function<Integer, DuckHelper> lambda5 = s -> new DuckHelper(s);
        Function<Integer, DuckHelper> methodRef5 = DuckHelper::new;

    }
}
