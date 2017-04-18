package ru.zvezdov.ocprof.chapter_5.DatesStringLocalization.Formatting;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * @author Dmitry Zvezdov
 *         17.04.17.
 */
public class FormatNumbers {
    public static void main(String[] args) {
        int attendeesPerYear = 3_200_000;
        int attendeePerMonth = attendeesPerYear / 12;
        NumberFormat us = NumberFormat.getInstance(Locale.US);
        System.out.println(us.format(attendeePerMonth));
        NumberFormat g = NumberFormat.getInstance(Locale.GERMANY);
        System.out.println(g.format(attendeePerMonth));
        NumberFormat ca = NumberFormat.getInstance(Locale.CANADA_FRENCH);
        System.out.println(ca.format(attendeePerMonth));

        double price = 48;
        NumberFormat us1 = NumberFormat.getCurrencyInstance();
        System.out.println(us1.format(price));

        NumberFormat en = NumberFormat.getInstance(Locale.US);
        NumberFormat fr = NumberFormat.getInstance(Locale.FRANCE);


        Double dollar = 15.0;
        Locale locale1 = Locale.US;
        NumberFormat format = NumberFormat.getCurrencyInstance(locale1);
        System.out.println(format.format(dollar));

        try {
            String s = "40.45";
            System.out.println(en.parse(s));
            System.out.println(fr.parse(s));

            String amt = "$92,807.99";
            NumberFormat cf = NumberFormat.getCurrencyInstance(Locale.US);
            double value = (Double) cf.parse(amt);
            System.out.println(value);

        }catch (ParseException e){
            System.out.println("Wow");
            e.printStackTrace();
        }



    }
}
