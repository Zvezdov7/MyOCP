package ru.zvezdov.ocprof.chapter_4.FunctionalProgramming.StramApi.WorkingWithPrimitives;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Dmitry Zvezdov
 *         14.04.17.
 */
public class Prim {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3);
        stream.reduce((x,y) -> x+y).ifPresent(System.out::println);

        final Stream<Integer> stream1 = Stream.of(1, 2, 3);
        System.out.println(stream1.mapToInt(x -> x).sum());

        IntStream intStream = IntStream.of(1,2,3);
        final OptionalDouble average = intStream.average();
        System.out.println(average.getAsDouble());

        DoubleStream oneValue = DoubleStream.of(3.14);
        DoubleStream varArgs = DoubleStream.of(2.2, 2.3, 2.4);
        oneValue.forEach(System.out::println);
        System.out.println();
        varArgs.forEach(System.out::println);

        DoubleStream random = DoubleStream.generate(Math::random);
        DoubleStream fractions = DoubleStream.iterate(.5, d -> d/2);
        random.limit(3).forEach(System.out::println);
        System.out.println();
        fractions.limit(5).forEach(System.out::println);

        IntStream range = IntStream.range(1, 6);
        IntStream rangeClosed = IntStream.rangeClosed(1, 6);
        rangeClosed.forEach(System.out::println);

        IntStream stream2 = IntStream.rangeClosed(1, 10);
        OptionalDouble optionalDouble = stream2.average();
        optionalDouble.ifPresent(System.out::println);
        System.out.println(optionalDouble.orElseThrow(() -> new RuntimeException("try more")));






    }
}
