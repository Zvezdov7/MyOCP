package ru.zvezdov.ocprof.chapter_5.DatesStringLocalization.DatesAndTimes;

import java.time.*;

/**
 * @author Dmitry Zvezdov
 *         17.04.17.
 */
public class LocalDateTimeApi {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());

        final LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
        final LocalDate date2 = LocalDate.of(2015, 1, 20);

        System.out.println(date1.equals(date2));
        System.out.println(date1);
        System.out.println(date2);

        final LocalTime time1 = LocalTime.of(6, 15);
        final LocalTime time2 = LocalTime.of(6, 15, 30);
        final LocalTime time3 = LocalTime.of(6, 15, 30, 200);

        System.out.println(time1 + " " + time2 + " " + time3);

        final LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.MAY, 20, 6, 15, 30);
        final LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);
        System.out.println(dateTime1 + " " + dateTime2);

        final ZoneId zone = ZoneId.of("US/Eastern");
        final ZonedDateTime zonedDateTime1 = ZonedDateTime.of(2015, 1, 20, 6, 15, 30, 200, zone);
        final ZonedDateTime zonedDateTime2 = ZonedDateTime.of(date1, time1, zone);
        final ZonedDateTime zonedDateTime3 = ZonedDateTime.of(dateTime1, zone);

        System.out.println(zonedDateTime1);
        System.out.println(ZoneId.systemDefault());
//        ZoneId.getAvailableZoneIds().stream().sorted().forEach(System.out::println);

//        LocalDate date4 = new LocalDate(); // DOESN'T COMPILE
//        LocalDate.of(2015, Month.JANUARY, 32); // DiteTimeException


        LocalDate date3 = LocalDate.of(2015, Month.JANUARY, 20);
        System.out.println(date3);
        date3 = date3.plusDays(3);
        System.out.println(date3);
        date3 = date3.plusWeeks(1);
        System.out.println(date3);
        date3 = date3.plusMonths(1);
        System.out.println(date3);
        date3.plusYears(5);
        System.out.println(date3);

        LocalDate date;
        LocalTime localTime;
        LocalDate date4 = LocalDate.of(2020, Month.JANUARY, 20);
        final LocalTime localTime4 = LocalTime.of(5, 15);
        LocalDateTime localDateTime = LocalDateTime.of(date4, localTime4);
        System.out.println(localDateTime);
        localDateTime = localDateTime.minusDays(1);
        System.out.println(localDateTime);
        localDateTime = localDateTime.minusHours(10);
        System.out.println(localDateTime);
        localDateTime.minusSeconds(30);
        System.out.println(localDateTime);


        localDateTime = localDateTime.minusDays(1).minusHours(10).minusSeconds(30);
        System.out.println(localDateTime);




    }
}
