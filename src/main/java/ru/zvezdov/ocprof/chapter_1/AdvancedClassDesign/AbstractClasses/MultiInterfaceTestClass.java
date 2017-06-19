package ru.zvezdov.ocprof.chapter_1.AdvancedClassDesign.AbstractClasses;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Dmitry Zvezdov
 *         03.05.17.
 */
interface i1{
    int VAL = 1;
    void method() throws IOException;
    default void method1(){};
}
interface i2{
    int VAL = 2;
    void method() throws FileNotFoundException;
}

public class MultiInterfaceTestClass implements i1, i2 {

    @Override
    public void method() throws FileNotFoundException {
    }

    public static void main(String[] args) throws FileNotFoundException {
        new MultiInterfaceTestClass().method();
    }
}

