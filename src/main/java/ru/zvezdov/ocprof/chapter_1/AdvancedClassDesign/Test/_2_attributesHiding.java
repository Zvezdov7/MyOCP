package ru.zvezdov.ocprof.chapter_1.AdvancedClassDesign.Test;

/**
 * @author Dmitry Zvezdov
 *         14.06.17.
 */
public class _2_attributesHiding {
    public static void main(String[] args) {
    }
}
class Parent {
    public int i = 0;
}
class Child extends Parent{
    private int i = 1;
}
