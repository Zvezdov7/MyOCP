package ru.zvezdov.ocprof.chapter_2.DesignPatternsAndPrinciples.DesigningAnInterface;

/**
 * @author Dmitry Zvezdov
 *         10.04.17.
 */
public interface Fly {
    public int getWingSpan() throws Exception;
    public static final int MAX_SPEED = 100;

    public default void land(){
        System.out.println("Animal is landing");
    }

    public static double calculateSpeed(float distance, double time){
        return distance/time;
    }
}
