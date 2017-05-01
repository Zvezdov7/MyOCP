package ru.zvezdov.ocprof.chapter_4.FunctionalProgramming.StramApi.WorkingWithPrimitives;

import ru.zvezdov.ocprof.chapter_4.FunctionalProgramming.BuiltInFunctionalInterfaces.MyInterfaces.MyBiConsumer;
import ru.zvezdov.ocprof.chapter_4.FunctionalProgramming.BuiltInFunctionalInterfaces.MyInterfaces.MySupplier;
import ru.zvezdov.ocprof.chapter_4.FunctionalProgramming.MyBaseStream;
import ru.zvezdov.ocprof.chapter_4.FunctionalProgramming.StramApi.MyStream;

import java.util.*;
import java.util.function.*;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * @author Dmitry Zvezdov
 *         01.05.17.
 */
public interface MyIntStream extends MyBaseStream<Integer, MyIntStream> {

    MyIntStream filter(IntPredicate predicate);

    MyIntStream map(IntUnaryOperator operator);

    <U>MyStream<U> mapToObj(IntFunction<? extends U> function);

    LongStream mapToLong(IntToLongFunction function);

    DoubleStream mapToDouble(IntToDoubleFunction function);

    MyIntStream flatMap(IntFunction<? extends MyIntStream> function);

    MyIntStream distinct();

    MyIntStream sorted();

    MyIntStream peek(IntConsumer consumer);

    MyIntStream limit(long maxSize);

    MyIntStream skip(long number);

    void forEach(IntConsumer consumer);

    void forEachOrdered(IntConsumer consumer);

    int[] toArray();

    int reduce(int identity, IntBinaryOperator operator);

    OptionalInt reduce(IntBinaryOperator operator);

    <R> R collect(MySupplier<R> supplier,
                  ObjIntConsumer<R> accumulator,
                  MyBiConsumer<R, R> combiner);

    int sum();

    OptionalInt min();

    OptionalInt max();

    long count();

    OptionalDouble average();

    IntSummaryStatistics summaryStatistics();

    boolean anyMatch(IntPredicate predicate);

    boolean allMatch(IntPredicate predicate);

    boolean noneMatch(IntPredicate predicate);

    OptionalInt findAny();

    OptionalInt findFirst();

    LongStream asLongStream();

    DoubleStream asDoubleStream();

    Stream<Integer> boxed();

    @Override
    MyIntStream sequental();

    @Override
    MyIntStream parallel();

    @Override
    PrimitiveIterator.OfInt iterator();

    @Override
    Spliterator.OfInt spliterator();


}
