package ru.zvezdov.ocprof.chapter_1.AdvancedClassDesign.Test;

/**
 * @author Dmitry Zvezdov
 *         15.06.17.
 */
public class _3_newInner {
    public class newInner {}

    public static void main(String[] args) {
        _3_newInner outer = new _3_newInner();
        _3_newInner.newInner inner = outer.new newInner();
    }
}
