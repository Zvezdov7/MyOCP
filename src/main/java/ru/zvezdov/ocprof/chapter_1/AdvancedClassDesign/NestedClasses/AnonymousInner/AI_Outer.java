package ru.zvezdov.ocprof.chapter_1.AdvancedClassDesign.NestedClasses.AnonymousInner;

import java.io.IOException;

/**
 * @author Dmitry Zvezdov
 *         10.04.17.
 *
 *         An anonymous inner class is a local inner class that does not have a name. It is declared
 *         and instantiated all in one statement using the new keyword. Anonymous inner classes are
 *         required to extend an existing class or implement an existing interface. They are useful when
 *         you have a short implementation that will not be used anywhere else.
 *
 */
public class AI_Outer {
    int kk = 3;

//    abstract class SaleTodayOnly{
//        abstract int dollarsOff();
//    }

    interface SaleTodayOnly{
        int dollarsOff();
    }

    abstract class AbstractInnerClass{
        int kk;

        public AbstractInnerClass() {
        }

        public AbstractInnerClass(int i) {
            kk = i;
        }
    }

    public void printKK(AbstractInnerClass abstractInnerClass){
        System.out.println(abstractInnerClass.kk);
    }

    public int admission(int basePrice, SaleTodayOnly sale){

//        SaleTodayOnly sale = new SaleTodayOnly() {
//            @Override
//            public int dollarsOff() {
//                return 3;
//            }
//        }; // Important semicolon
        return basePrice - sale.dollarsOff();
    }

    public int pay(){
        int l = 3;

        return admission(5, new SaleTodayOnly() {
            int l = 2;
            @Override
            public int dollarsOff() {
                return kk;
            }
        });
    }

    public static void main(String[] args) {
        AI_Outer outer = new AI_Outer();
        System.out.println(outer.pay());

        outer.printKK(outer.new AbstractInnerClass() {

            public static final int aa = 12;
            @Override
            public int hashCode() {
                return super.hashCode();
            }

            @Override
            public boolean equals(Object obj) {
                return super.equals(obj);
            }

            @Override
            protected Object clone() throws CloneNotSupportedException {
                return super.clone();
            }

            @Override
            public String toString() {
                return super.toString();
            }

            @Override
            protected void finalize() throws Throwable {
                super.finalize();
            }
        });
    }


}
