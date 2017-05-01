package ru.zvezdov.ocprof.chapter_2.DesignPatternsAndPrinciples.AbstractFactory;

/**
 * @author Dmitry Zvezdov
 *         25.04.17.
 */
public class BoyGirlFactory {
    public static Boy createBoy(){ return new Boy(); }
    public static Girl cleateGirl(){ return new Girl(); }
}
