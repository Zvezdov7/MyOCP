package ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Generics.Bounds;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Dmitry Zvezdov
 *         11.04.17.
 */
public class Goose implements Flyer {
    @Override
    public void fly() {

    }

    private void anyFlyer(List<Flyer> flyers){}
    private void groupOfFlyers(List<? extends Flyer> flyers){}

    public static void main(String[] args) {
//        new Goose().anyFlyer(new ArrayList<Goose>());
        new Goose().anyFlyer(new ArrayList<Flyer>());
//        new Goose().groupOfFlyers(new ArrayList<Object>());
        new Goose().groupOfFlyers(new ArrayList<Goose>());

        List<? extends Number> list = new ArrayList<Integer>();



        List<String> strings = new ArrayList<String>();
        strings.add("tweet");
        List<Object> objects = new ArrayList<Object>(strings);
        addSound(strings);
        addSound(objects);



        List<? super IOException> exceptions = new ArrayList<>();
        addException(exceptions);

    }

//    private static void addSound(List<?> list) { // unbounded generics are immutable
//    private static void addSound(List<? extends Object> list) { // upper-bounded generics are immutable
//    private static void addSound(List<Object> list) { // generics must pass exact match
    private static void addSound(List<? super String> list) {
        list.add("quack");
    }

    public static void addException(List<? super IOException> list){
        list.add(new IOException());
//        list.add(new Exception());
        list.add(new FileNotFoundException());
//        list.add(new RuntimeException());
    }
}
