package ru.zvezdov.ocprof.chapter_1.AdvancedClassDesign.OverloadingAndOverriding;

/**
 * @author Dmitry Zvezdov
 *         03.05.17.
 */
interface A1 {
    void a1();
    default void a2(){}
}
interface B1 extends A1{
    default void b1(){
        a1();
        a2();
    }
}

public class ImplementingDefaultMethods implements B1{
    public static void main(String[] args) {
        ImplementingDefaultMethods implementingDefaultMethods = new ImplementingDefaultMethods();
        implementingDefaultMethods.a1();
        implementingDefaultMethods.a2();
        implementingDefaultMethods.b1();
    }

    @Override
    public void a1() {

    }
}
