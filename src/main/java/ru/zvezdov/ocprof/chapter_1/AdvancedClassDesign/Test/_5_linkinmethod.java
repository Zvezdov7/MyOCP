package ru.zvezdov.ocprof.chapter_1.AdvancedClassDesign.Test;

/**
 * Created by Dmitry on 28.06.2017.
 */
public class _5_linkinmethod {
    public static void main(String[] args) {
        String ss = new String("Kojoj");
        m(ss);
        System.out.println(ss);
    }
    public static void m(String s) {
        s = new String("haha");
    }
}
