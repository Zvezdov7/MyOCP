package ru.zvezdov.ocprof.chapter_1.AdvancedClassDesign.NestedClasses.StaticNested;

/**
 * @author Dmitry Zvezdov
 *         10.04.17.
 *
 *         A static nested class is a static
 *         class defined at the member level. It can be instantiated without an object of the
 *         enclosing class, so it can’t access the instance variables without an explicit object of
 *         the enclosing class.
 *
 *         In other words, it is like a regular class except for the following:
 *         The nesting creates a namespace because the enclosing class name must be used to refer
 *         to it.
 *         It can be made private or use one of the other access modifiers to encapsulate it.
 *         The enclosing class can refer to the fields and methods of the static nested class.
 *
 *         ONLY STATIC INNER CLASS CAN DECLARE STATIC METHODS
 */
public class SN_Outer {
    static  abstract class llala{}
    static class Nested{
        private int price = 6;
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        System.out.println(nested.price);

        Nested nested1 = new SN_Outer.Nested();
    }
}
class someClass {
    void m() {
        new SN_Outer.Nested();
    }
}
