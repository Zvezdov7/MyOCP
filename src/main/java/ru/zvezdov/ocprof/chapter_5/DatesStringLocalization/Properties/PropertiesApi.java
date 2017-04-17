package ru.zvezdov.ocprof.chapter_5.DatesStringLocalization.Properties;

import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * @author Dmitry Zvezdov
 *         17.04.17.
 */
public class PropertiesApi {
    public static void main(String[] args) {
        Locale us = new Locale("en", "US");
        Locale france = new Locale("fr", "FR");
        Locale englishCanada = new Locale("en", "CA");
        Locale franceCanada = new Locale("fr", "CA");

//        printProperties(us);
        System.out.println();
//        printProperties(france);

        ResourceBundle rb = ResourceBundle.getBundle("Zoo", us);
        rb.keySet().stream().map(k -> k + " " + rb.getString(k)).forEach(System.out::println);

        Properties properties = new Properties();
        rb.keySet().stream().map(k -> properties.put(k, rb.getString(k)));

        System.out.println(properties.getProperty("notReallyAProperty"));
        System.out.println(properties.getProperty("notReallyAProperty", "123"));

        ResourceBundle resourceBundle = ResourceBundle.getBundle("ru.zvezdov.ocprof.chapter_5.DatesStringLocalization.Properties.Tax", us);
        System.out.println(resourceBundle.getString("tax"));

        System.out.println(Locale.getDefault());


    }

    private static void printProperties(Locale locale) {
        ResourceBundle rb = ResourceBundle.getBundle("Zoo", locale);
        System.out.println(rb.getString("hello"));
        System.out.println(rb.getString("open"));

    }
}
