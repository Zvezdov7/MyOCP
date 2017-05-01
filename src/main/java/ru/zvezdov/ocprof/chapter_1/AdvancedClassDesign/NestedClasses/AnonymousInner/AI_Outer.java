package ru.zvezdov.ocprof.chapter_1.AdvancedClassDesign.NestedClasses.AnonymousInner;

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
    }


}
