package ru.zvezdov.ocprof.chapter_6.ExceptionsAndAssertions.Exceptions.TryWithResources;

import ru.zvezdov.ocprof.chapter_6.ExceptionsAndAssertions.Exceptions.FuckedException;

/**
 * @author Dmitry Zvezdov
 *         01.06.17.
 */
public class NewFuckedClass {
    public static void main(String[] args) {
        try {
            new FuckedException().someFuckedMethod();
        } catch (Exception ex) {
        }
    }
}
