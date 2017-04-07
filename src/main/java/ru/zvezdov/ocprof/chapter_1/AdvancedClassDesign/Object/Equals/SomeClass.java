package ru.zvezdov.ocprof.chapter_1.AdvancedClassDesign.Object.Equals;

/**
 * @author Dmitry Zvezdov
 *         07.04.17.
 */
public class SomeClass {
    public static void main(String[] args) {
        String s1 = new String("lion");
        String s2 = new String("lion");

        System.out.println(s1.equals(s2));

        StringBuilder sb1 = new StringBuilder("lion");
        StringBuilder sb2 = new StringBuilder("lion");

        System.out.println(sb1.equals(sb2));

    }
}
