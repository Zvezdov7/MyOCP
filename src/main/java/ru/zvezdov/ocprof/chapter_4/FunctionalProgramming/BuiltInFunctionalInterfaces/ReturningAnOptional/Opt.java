package ru.zvezdov.ocprof.chapter_4.FunctionalProgramming.BuiltInFunctionalInterfaces.ReturningAnOptional;

import java.util.Optional;

/**
 * @author Dmitry Zvezdov
 *         13.04.17.
 */
public class Opt {

    public static Optional<Double> average(int... scores){
        if (scores.length == 0) return Optional.empty();
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return Optional.of((double) sum / scores.length);
    }

    public static void main(String[] args) {

        System.out.println(average(90, 100));
        System.out.println(average());

        final Optional<Double> average = average(90, 1000);
        if (average.isPresent()) System.out.println(average.get());

        final Optional<Double> average1 = average();
//        System.out.println(average1.get()); // NoSuchEle,entException

        String value = null;
        final Optional<?> o = (value == null) ? Optional.empty() : Optional.of(value);
        final Optional<String> o1 = Optional.ofNullable(value);


        Optional<Double> opt = average(90, 100);
        opt.ifPresent(System.out::println);

        Optional<Double> opt1 = average();
        System.out.println(opt1.orElse(Double.NaN));
        System.out.println(opt1.orElseGet(Math::random));
//        System.out.println(opt1.orElseThrow(IllegalArgumentException::new));


    }

}
