package ru.zvezdov.ocprof.chapter_4.FunctionalProgramming.BuiltInFunctionalInterfaces.MyInterfaces;

/**
 * @author Dmitry Zvezdov
 *         27.04.17.
 */
@FunctionalInterface
public interface MyPredicate<T> {
    boolean test(T t);
}
