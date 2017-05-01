package ru.zvezdov.ocprof.chapter_2.DesignPatternsAndPrinciples.Singleton;

/**
 * @author Dmitry Zvezdov
 *         25.04.17.
 */
public class MySingleton {
    private static MySingleton instance;
    private MySingleton(){}

    private int quantity;

    public static MySingleton getInstance(){
        if (instance == null){
            instance = new MySingleton();
        }
        return instance;
    }

    public void addQuantity(){
        quantity++;
    }

    public int getQuantity() {
        return quantity;
    }

    public static void main(String[] args) {

    }
}
