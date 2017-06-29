package ru.zvezdov.ocprof.chapter_6.ExceptionsAndAssertions.Assertions;

import java.util.LinkedList;

/**
 * @author Dmitry Zvezdov
 *         17.04.17.
 */
public class Assertions {
    public static void main(String[] args) {
        int numGuests = -1;
        boolean bal = true;
        assert numGuests > 0: bal;
        System.out.println(numGuests);
    }
}
