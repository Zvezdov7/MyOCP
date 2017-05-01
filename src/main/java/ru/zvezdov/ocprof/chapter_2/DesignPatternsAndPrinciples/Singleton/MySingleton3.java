package ru.zvezdov.ocprof.chapter_2.DesignPatternsAndPrinciples.Singleton;

/**
 * @author Dmitry Zvezdov
 *         25.04.17.
 */
public final class MySingleton3 {
    private MySingleton3(){};
    private static class SingletonHolder{
        private static final MySingleton3 instance = new MySingleton3();
    }
    public static MySingleton3 getInstance(){
        return SingletonHolder.instance;
    }

}
