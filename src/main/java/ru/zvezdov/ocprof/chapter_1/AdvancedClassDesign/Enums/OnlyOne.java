package ru.zvezdov.ocprof.chapter_1.AdvancedClassDesign.Enums;

/**
 * @author Dmitry Zvezdov
 *         07.04.17.
 */
public enum OnlyOne {
    ONCE(true);

    OnlyOne(boolean b) {
        System.out.println("constructing");
    }

    public static void main(String[] args) {
        OnlyOne firstCall = OnlyOne.ONCE;
        OnlyOne secondCall = OnlyOne.ONCE;
    }
}
