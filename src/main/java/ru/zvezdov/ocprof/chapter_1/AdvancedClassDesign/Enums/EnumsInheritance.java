package ru.zvezdov.ocprof.chapter_1.AdvancedClassDesign.Enums;

import java.util.RandomAccess;

/**
 * @author Dmitry Zvezdov
 *         03.05.17.
 */
public class EnumsInheritance {
    enum E1 implements Runnable{
        A1 {
            @Override
            public void run() {

            }
        }, B1 {
            @Override
            public void run() {

            }
        }, C1 {
            @Override
            public void run() {

            }
        };
    }
    enum E2 {
        A2, B2, C2;
        private String ok;
    }

    public static void main(String[] args) {
        System.out.println(E1.A1.valueOf(E1.class,"a"));

    }
}
