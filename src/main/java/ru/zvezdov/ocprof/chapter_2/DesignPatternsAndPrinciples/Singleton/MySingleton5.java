package ru.zvezdov.ocprof.chapter_2.DesignPatternsAndPrinciples.Singleton;

/**
 * @author Dmitry Zvezdov
 *         25.04.17.
 */
public class MySingleton5 {
    private MySingleton5(){}
    private static MySingleton5 instance;
    public static MySingleton5 getInstance(){
        if (instance == null){
            synchronized (MySingleton5.class){
                if (instance == null){
                    instance = new MySingleton5();
                }
            }
        }
        return instance;
    }
}
