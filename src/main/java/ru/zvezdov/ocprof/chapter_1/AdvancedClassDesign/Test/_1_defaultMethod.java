package ru.zvezdov.ocprof.chapter_1.AdvancedClassDesign.Test;

/**
 * @author Dmitry Zvezdov
 *         13.06.17.
 */
public class _1_defaultMethod implements After {
    public static void main(String[] args) {
        Inter inter = new _1_defaultMethod();
        inter.inter();
    }

    @Override
    public void inter() {

    }
}

interface Inter {
    default void inter(){}
}

interface After extends Inter {
    void inter();
}
