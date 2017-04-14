package ru.zvezdov.ocprof.chapter_4.FunctionalProgramming.StramApi;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;

/**
 * @author Dmitry Zvezdov
 *         13.04.17.
 */
public class StrApi {
    public static void main(String[] args) {
        Stream<String> empty = Stream.empty();
        Stream<Integer> singleElement = Stream.of(1);
        Stream<Integer> fromArray = Stream.of(1, 2, 3);

        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> fromList = list.stream();
        Stream<String> fromListParallel = list.parallelStream();


        Stream<Double> randoms = Stream.generate(Math::random);
        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);
//        randoms.forEach(System.out::println);
//        oddNumbers.forEach(System.out::println);


        /**
         * Putting together the pipeline
         */

        List<String> list1 = Arrays.asList("Toby", "Anny", "Leroy", "Alex");
        List<String> filtered = new ArrayList<>();
        for (String name: list){
            if (name.length() == 4) filtered.add(name);
        }
        Collections.sort(filtered);
        Iterator<String> iter = filtered.iterator();
        if(iter.hasNext()) System.out.println(iter.hasNext());
        if(iter.hasNext()) System.out.println(iter.hasNext());


        List<String> list2 = Arrays.asList("Timm", "Bimm", "Lil", "Woo");
        final Stream<String> stream = list2.stream();
        stream.filter(n -> n.length() == 4)
                .sorted()
                .limit(2)
                .forEach(System.out::println);


    }
}
