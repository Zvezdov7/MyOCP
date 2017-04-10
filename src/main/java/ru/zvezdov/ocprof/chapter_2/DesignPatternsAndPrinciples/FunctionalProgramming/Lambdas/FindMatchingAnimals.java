package ru.zvezdov.ocprof.chapter_2.DesignPatternsAndPrinciples.FunctionalProgramming.Lambdas;

import java.util.function.Predicate;

/**
 * @author Dmitry Zvezdov
 *         10.04.17.
 */
public class FindMatchingAnimals {
//    public static void print(Animal animal, CheckTrait trait){
    public static void print(Animal animal, Predicate<Animal> trait){
        if (trait.test(animal)){
            System.out.println(animal);
        }
    }

    public static void main(String[] args) {

        /**
         *  This expression means that Java should call a method with an Animal parameter that
         *  returns a boolean value that’s the result of a.canHop() .
         */
        print(new Animal("fish", false, true), a -> a.isCanHop());
        print(new Animal("kangaroo", true, false), a -> a.isCanHop());

        /**
         *  Alternative
         *
         *  required return and semicolon
         */
        print(new Animal("kangaroo-boy", true, false), (Animal a) -> {return a.isCanHop();});


        /**
         *  Anonymous inner class alternative
         */
//        print(new Animal("kangaroo-old", true, false), new CheckTrait() {
        print(new Animal("kangaroo-old", true, false), new Predicate<Animal>() {
            @Override
            public boolean test(Animal a) {
                return a.isCanHop();
            }
        });
    }
}
