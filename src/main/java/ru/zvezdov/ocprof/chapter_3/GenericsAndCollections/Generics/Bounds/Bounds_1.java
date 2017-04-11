package ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Generics.Bounds;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dmitry Zvezdov
 *         11.04.17.
 */
public class Bounds_1 {
//    public static void printList(List<Object> list){
    public static void printList(List<?> list){

        for (Object o : list) {
            System.out.println(o);
        }
    }

    public static long total(List<? extends Number> list){
        long count = 0;
        for (Number number : list) {
            count += number.longValue();
        }
        return count;
    }

    static  class Bird{}
    static class Sparrow extends Bird{}

    public static void main(String[] args) {
        List<String> keywords = new ArrayList<>();
        keywords.add("java");
        printList(keywords); // Doesn't compile

        List<? extends Bird> birds = new ArrayList<Bird>();
//        birds.add(new Sparrow()); // Doesn't compile
//        birds.add(new Bird()); // Doesn't compile


    }






}
