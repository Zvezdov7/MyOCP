package ru.zvezdov.ocprof.chapter_1.AdvancedClassDesign.Enums;

/**
 * @author Dmitry Zvezdov
 *         03.05.17.
 */
public class ClassWithEnum {

    enum Season{
        WINTER, SUMMER
    }

    public ClassWithEnum() {

    }

    public static void main(String[] args) {
        for (Season season : Season.values()) {
            System.out.println(season);
        }
    }
}
