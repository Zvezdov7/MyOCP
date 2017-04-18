package ru.zvezdov.ocprof.chapter_6.ExceptionsAndAssertions.Assertions;

/**
 * @author Dmitry Zvezdov
 *         17.04.17.
 */
public class Assertions {
    public static void main(String[] args) {
        int numGuests = 5;
        assert numGuests > 0: "Aaaaaaah";
        System.out.println(numGuests);
    }
}
