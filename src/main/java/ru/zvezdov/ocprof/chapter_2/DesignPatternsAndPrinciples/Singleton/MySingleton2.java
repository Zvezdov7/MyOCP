package ru.zvezdov.ocprof.chapter_2.DesignPatternsAndPrinciples.Singleton;

/**
 * @author Dmitry Zvezdov
 *         25.04.17.
 */
public class MySingleton2 {
    private static MySingleton2 instance = new MySingleton2();
    private MySingleton2(){}
    public static MySingleton2 getInstance(){
        return instance;
    }
}
