package ru.zvezdov.ocprof.chapter_6.ExceptionsAndAssertions.Exceptions;

/**
 * @author Dmitry Zvezdov
 *         01.06.17.
 */
public class FuckedException {
    public void someFuckedMethod() throws Exception {
        throw new Exception();
    }
}
