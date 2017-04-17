package ru.zvezdov.ocprof.chapter_5.DatesStringLocalization.Locale;

import java.util.Locale;

/**
 * @author Dmitry Zvezdov
 *         17.04.17.
 */
public class LocaleApi {
    public static void main(String[] args) {
        final Locale locale = Locale.getDefault();
        System.out.println(locale);

        System.out.println(Locale.CANADA);
        System.out.println(Locale.CANADA_FRENCH);
        System.out.println(Locale.GERMAN);
        System.out.println(Locale.GERMANY);
        System.out.println(Locale.ENGLISH);
        System.out.println(Locale.UK);

        System.out.println(new Locale("ru", "RU"));

        Locale l1 = new Locale.Builder()
                .setLanguage("en")
                .setRegion("US")
                .build();
        Locale l2 = new Locale.Builder()
                .setRegion("US")
                .setLanguage("en")
                .build();
    }
}
