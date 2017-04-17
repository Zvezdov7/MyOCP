package ru.zvezdov.ocprof.chapter_5.DatesStringLocalization.DatesAndTimes;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * @author Dmitry Zvezdov
 *         17.04.17.
 */
public class DurationApi {
    public static void main(String[] args) {
        final Duration daily = Duration.ofDays(1);
        final Duration hourly = Duration.ofHours(1);
        final Duration everyMinute = Duration.ofMinutes(1);
        final Duration everySecond = Duration.ofSeconds(10);
        final Duration secondAndNano = Duration.ofSeconds(1, 1);
        final Duration everyMilli = Duration.ofMillis(1);
        final Duration everyNano = Duration.ofNanos(1);

        System.out.println(daily);
        System.out.println(hourly);
        System.out.println(everyMinute);
        System.out.println(everySecond);
        System.out.println(everyMilli);
        System.out.println(everyNano);

        Duration.of(1, ChronoUnit.MINUTES);
        Duration.of(1, ChronoUnit.HALF_DAYS);
        final Duration cent = Duration.of(1, ChronoUnit.HALF_DAYS);
        System.out.println(cent);

        LocalTime one = LocalTime.of(5, 15);
        LocalTime two = LocalTime.of(6, 30);
        LocalDate date = LocalDate.of(2016, 1, 20);

        System.out.println(ChronoUnit.MILLIS.between(one, two));
        System.out.println(ChronoUnit.HALF_DAYS.between(one, two));
//        System.out.println(ChronoUnit.MINUTES.between(one, date)); // DateTimeException




    }
}
