package ru.zvezdov.ocprof.chapter_1.AdvancedClassDesign.NestedClasses.MemberInner;

/**
 * @author Dmitry Zvezdov
 *         10.04.17.
 *
 *         A member inner class is defined at the member level of a class (the same level as the methods,
 *         instance variables, and constructors).
 *
 *         Can be declared public, private, or protected or use default access
 *         Can extend any class and implement interfaces
 *         Can be abstract or final
 *     !!! Cannot declare static fields or methods
 *     !!! Can access members of the outer class including private members
 *
 *
 */
public class MI_Outer {
    private String greeting = "Hello";

    protected class Inner {
        public int repeat = 3;
        public void go(){
            for(int i =0; i < repeat; i++){
                System.out.println(greeting);
            }
        }
    }

    public void callInner(){
        Inner inner = new Inner();
        inner.go();
    }

    public static void main(String[] args) {


        MI_Outer outer = new MI_Outer();

//        outer.callInner();
        Inner inner = outer.new Inner();
        inner.go();


        MI_PrivateInterface.Secret secret = new MI_PrivateInterface().new DontTell();
        secret.shh();

    }

}
