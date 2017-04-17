package ru.zvezdov.ocprof.chapter_5.DatesStringLocalization.DatesAndTimes;

import java.time.*;

/**
 * @author Dmitry Zvezdov
 *         17.04.17.
 */
public class InstantApi {
    public static void main(String[] args) {
        Instant now = Instant.now();
        long k;
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " nigga get money");
            for (int j = 0; j < 100000; j++){
                k = i + j;
            }
        }
        Instant later = Instant.now();
        System.out.println(now);
        System.out.println(later);
        Duration duration = Duration.between(now, later);
        System.out.println(duration.toMillis());

        LocalDate date = LocalDate.of(2015, 5, 25);
        LocalTime time = LocalTime.of(11, 55, 00);
        ZoneId zone = ZoneId.of("US/Eastern");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(date, time, zone);
        Instant instant = zonedDateTime.toInstant();
        System.out.println(zonedDateTime);
        System.out.println(instant);


        final Instant instant1 = Instant.ofEpochMilli(System.currentTimeMillis());
        System.out.println(instant1);


        LocalDate date1 = LocalDate.of(2016, Month.MARCH, 13);
        LocalTime time1 = LocalTime.of(3, 30);
        ZoneId zone1 = ZoneId.of("US/Eastern");
        ZonedDateTime dateTime = ZonedDateTime.of(date1, time1, zone);
        System.out.println(dateTime);
        dateTime = dateTime.plusHours(1);
        System.out.println(dateTime);


    }
}
