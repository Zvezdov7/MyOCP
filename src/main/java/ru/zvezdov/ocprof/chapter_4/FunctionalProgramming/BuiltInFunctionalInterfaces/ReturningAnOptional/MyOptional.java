package ru.zvezdov.ocprof.chapter_4.FunctionalProgramming.BuiltInFunctionalInterfaces.ReturningAnOptional;

import ru.zvezdov.ocprof.chapter_1.AdvancedClassDesign.Object.MyObject;
import ru.zvezdov.ocprof.chapter_4.FunctionalProgramming.BuiltInFunctionalInterfaces.MyInterfaces.MyConsumer;
import ru.zvezdov.ocprof.chapter_4.FunctionalProgramming.BuiltInFunctionalInterfaces.MyInterfaces.MyFunction;
import ru.zvezdov.ocprof.chapter_4.FunctionalProgramming.BuiltInFunctionalInterfaces.MyInterfaces.MyPredicate;

import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author Dmitry Zvezdov
 *         27.04.17.
 */
public final class MyOptional<T> {
    public static final MyOptional<?> EMPTY = new MyOptional<>();

    private final T value;

    private MyOptional() {
        this.value = null;
    }


    public static <T> MyOptional<T> empty(){
        return (MyOptional<T>) EMPTY;
    }

    private MyOptional(T value) {
        this.value = Objects.requireNonNull(value);
    }

    public static <T> MyOptional<T> of(T value){
        return new MyOptional<T>(value);
    }

    public static <T> MyOptional<T> ofNullable(T value){
        return value == null ? empty() : new MyOptional<T>(value);
    }

    public T get(){
        if (value == null) {
            throw new NoSuchElementException("No value present");
        }
        return value;
    }

    public boolean isPresent(){ return value != null;}

    public void ifPresent(MyConsumer<? super T> consumer){
        if (isPresent())
            consumer.accept(value);
    }

    public MyOptional<T> filter(MyPredicate<? super T> predicate) {
        Objects.requireNonNull(predicate);
        if (!isPresent())
            return this;
        else return predicate.test(value) ? this : empty();
    }

    public <U> MyOptional<U> map(MyFunction<? super T, ? extends U> function){
        Objects.requireNonNull(function);
        if (!isPresent())
            return empty();
        else
            return MyOptional.ofNullable(function.apply(value));
    }

    public <U> MyOptional<U> flatMap(MyFunction<? super T, MyOptional<U>> function){
        Objects.requireNonNull(function);
        if (!isPresent())
            return empty();
        else return Objects.requireNonNull(function.apply(value));
    }

    public T orElse(T other){
        return isPresent() ? value : other;
    }

    public T orElseGet(Supplier<? extends T> supplier){
        return isPresent() ? value : supplier.get();
    }

    public <X extends Throwable> T orElseThrow(Supplier<? extends X> supplier) throws X{
        if (isPresent())
            return value;
        else throw supplier.get();
    }

    public boolean equals(Object object){
        if (this == object)
            return true;
        if (! (object instanceof MyOptional)) return false;
        MyOptional<?> other = (MyOptional<?>) object;
        return Objects.equals(value, other.value);
    }

    public int hashCode(){ return Objects.hashCode(value); }

    @Override
    public String toString() {
        return value != null
                ? String.format("Optional[%s]", value)
                : "Optional.empty";
    }


}
