package ru.zvezdov.ocprof.chapter_5.DatesStringLocalization.Test;

import java.time.*;
import java.util.TimeZone;

/**
 * Created by Dmitry on 23.06.2017.
 */
public class _0_DateTimeApi_between {
    public static void main(String[] args) {
        Period period = Period.between(LocalDate.now(), LocalDate.of(2017, Month.JUNE, 24));
        System.out.println(period);


    }
}
