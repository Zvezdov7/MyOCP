package ru.zvezdov.ocprof.chapter_4.FunctionalProgramming.BuiltInFunctionalInterfaces;

/**
 * @author Dmitry Zvezdov
 *         03.05.17.
 */
@FunctionalInterface
public interface MyFunctionalInterface {
    void method();
    static void method1(){}
    default void method2(){}
}
