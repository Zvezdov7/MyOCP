package ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Collections.ComparableVsComparator.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Dmitry Zvezdov
 *         12.04.17.
 *
 *         Comparison of Comparable and Comparator
 *         Difference                                           Comparable      Comparator
 *
 *         Package name                                         java.lang       java.util
 *         Interface must be implemented by class comparing?    Yes             No
 *         Method name in interface                             compareTo       compare
 *         Number of parameters                                 1               2
 *         Common to declare using a lambda                     No              Yes
 *
 *
 */
public class Duck implements Comparable<Duck> {

    private String name;
    private int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Duck o) {
        return name.compareTo(o.name);
    }

    public static void main(String[] args) {
//        Comparator<Duck> byWeight = new Comparator<Duck>() {
//            @Override
//            public int compare(Duck o1, Duck o2) {
//                return o1.getWeight() - o2.getWeight();
//            }
//        };
        Comparator<Duck> byWeight = (o1, o2) -> o1.getWeight() - o2.getWeight();
//        Comparator<Duck> byWeight = (o1, o2) -> { return o1.getWeight() - o2.getWeight();};
//        Comparator<Duck> byWeight = (Duck o1, Duck o2) -> o1.getWeight() - o2.getWeight();
//        Comparator<Duck> byWeight = (Duck o1, Duck o2) -> {return o1.getWeight() - o2.getWeight();};

        List<Duck> ducks = new ArrayList<>();
        ducks.add(new Duck("Quack", 7));
        ducks.add(new Duck("Puddles", 10));
        Collections.sort(ducks);
        System.out.println(ducks);
        Collections.sort(ducks, byWeight);
        System.out.println(ducks);


    }
}
