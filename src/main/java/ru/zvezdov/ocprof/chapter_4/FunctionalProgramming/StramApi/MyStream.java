package ru.zvezdov.ocprof.chapter_4.FunctionalProgramming.StramApi;

import ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Collections.ComparableVsComparator.MyComparable;
import ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Collections.ComparableVsComparator.MyComparator;
import ru.zvezdov.ocprof.chapter_4.FunctionalProgramming.BuiltInFunctionalInterfaces.MyInterfaces.*;
import ru.zvezdov.ocprof.chapter_4.FunctionalProgramming.BuiltInFunctionalInterfaces.ReturningAnOptional.MyOptional;
import ru.zvezdov.ocprof.chapter_4.FunctionalProgramming.MyBaseStream;

import java.util.function.IntFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.stream.*;

/**
 * @author Dmitry Zvezdov
 *         28.04.17.
 */
public interface MyStream<T> extends MyBaseStream<T, MyStream<T>> {

    MyStream<T> filter(MyPredicate<? super T> predicate);

    <R> MyStream<R> map(MyFunction<? super T, ? extends R> function);

    IntStream mapToInt(ToIntFunction<? super T> function);

    DoubleStream mapToDouble(ToDoubleFunction<? super T> function);

    LongStream mapToLong(ToLongFunction<? super T> function);

    <R> MyStream<R> flatMap(MyFunction<? super T, ? extends MyStream<? extends R>> function);

    IntStream flatMapToInt(MyFunction<? super T, ? extends IntStream> function);

    LongStream flatMapToLong(MyFunction<? super T, ? extends LongStream> function);

    DoubleStream flatMapToDouble(MyFunction<? super T, ? extends DoubleStream> function);

    MyStream<T> distinct();

    MyStream<T> sorted();

    MyStream<T> sorted(MyComparator<? super T> comparator);

    MyStream<T> peek(MyConsumer<? super T> consumer);

    MyStream<T> limit(long maxSize);

    MyStream<T> skip(long n);


    Object[] toArray();

    <A> A[] toArray(IntFunction<A[]> generator);

    <U> U reduce(U identity,
                 MyBiFunction<U, ? super T, U> accumulator,
                 MyBinaryOperator<U> combiner);

    <R> R collect(MySupplier<R> generator,
                  MyBiConsumer<R, ? super T> accumulator,
                  MyBiConsumer<R, R> combiner);

    <R, A> R collect(Collector<? super T, A, R> collector);

    T reduce(T identity, MyBinaryOperator<T> accumulator);

    MyOptional<T> findAny();

    MyOptional<T> findFirst();

    MyOptional<T> reduce(MyBinaryOperator<T> accumulator);

    MyOptional<T> min(MyComparator<? super T> comparator);

    MyOptional<T> max(MyComparator<? super T> comparator);

    void forEach(MyConsumer<? super T> consumer);

    void forEachOrdered(MyConsumer<? super T> consumer);

    long count();

    boolean anyMach(MyPredicate<? super T> predicate);

    boolean allMach(MyPredicate<? super T> predicate);

    boolean noneMach(MyPredicate<? super T> predicate);


    public interface MyBuilder<T> extends MyConsumer<T> {

        @Override
        void accept(T t);

        default MyBuilder<T> add(T t){
            accept(t);
            return this;
        }

        MyStream<T> build();
    }

//    public static <T> Stream.Builder<T> builder(){return }














}
