package ru.zvezdov.ocprof.chapter_7.Concurrency.Basic.ExecutorServiceApi;

import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.function.Supplier;

/**
 * @author Dmitry Zvezdov
 *         18.04.17.
 */
public class AmbiguousLambdaSample {
    public static void useCallable(Callable<Integer> expression) {}
    public static void useSupplier(Supplier<Integer> expression) {}

    public static void use(Supplier<Integer> expression) {}
    public static void use(Callable<Integer> expression) {}

    public static void main(String[] args) {
        useCallable(() -> { throw new IOException();}); // Compiles
//        useSupplier(() -> { throw new IOException();}); // Doesn't compile
//        use(() ->  {throw new IOException();}); // Doesn't compile
        use((Callable<Integer>) () ->  {throw new IOException();}); // Compiles
    }
}
