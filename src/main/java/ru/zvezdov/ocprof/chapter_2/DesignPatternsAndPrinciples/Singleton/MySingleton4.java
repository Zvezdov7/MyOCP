package ru.zvezdov.ocprof.chapter_2.DesignPatternsAndPrinciples.Singleton;

/**
 * @author Dmitry Zvezdov
 *         25.04.17.
 */
public class MySingleton4 {
    private MySingleton4(){}
    private static MySingleton4 instance;
    public static synchronized MySingleton4 getInstance(){
        if (instance == null){
            instance = new MySingleton4();
        }
        return instance;
    }
}
