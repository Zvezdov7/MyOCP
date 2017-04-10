package ru.zvezdov.ocprof.chapter_2.DesignPatternsAndPrinciples.DesigningAnInterface;

/**
 * @author Dmitry Zvezdov
 *         10.04.17.
 */
public class Eagle implements Fly {
    @Override
    public int getWingSpan() throws Exception {
        return 15;
    }

    @Override
    public void land() {
        System.out.println("Eagle is flying fast");
    }
}
