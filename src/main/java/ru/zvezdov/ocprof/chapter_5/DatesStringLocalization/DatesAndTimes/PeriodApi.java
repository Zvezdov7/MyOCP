package ru.zvezdov.ocprof.chapter_5.DatesStringLocalization.DatesAndTimes;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 * @author Dmitry Zvezdov
 *         17.04.17.
 */
public class PeriodApi {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate localDate1 = LocalDate.of(2015, Month.MARCH, 30);
        preformAnimal(localDate, localDate1);

        Period period = Period.ofMonths(1);
        performAnimalEnrichment(localDate, localDate1, period);

        final Period annually = Period.ofYears(1);
        final Period quarterly = Period.ofMonths(3);
        final Period everyThreeWeeks = Period.ofWeeks(3);
        final Period everyOtherDay = Period.ofDays(2);
        final Period everyYearAndAWeek = Period.of(1, 0, 7);
        System.out.println(annually);
        System.out.println(everyYearAndAWeek);
        System.out.println(everyThreeWeeks);
        System.out.println(quarterly);
    }

    private static void performAnimalEnrichment(LocalDate localDate, LocalDate localDate1, Period period) {
        LocalDate upTo = localDate;
        while (upTo.isBefore(localDate1)){
            System.out.println("give new toy" + upTo);
            upTo = upTo.plus(period);
        }
    }

    private static void preformAnimal(LocalDate localDate, LocalDate localDate1) {
        LocalDate upTo = localDate;
        while (upTo.isBefore(localDate1)){
            System.out.println("give new toy" + upTo);
            upTo = upTo.plusMonths(1);
        }
    }
}
