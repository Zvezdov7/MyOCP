package ru.zvezdov.ocprof.chapter_6.ExceptionsAndAssertions.Exceptions.TryWithResources;

import java.io.Closeable;
import java.io.IOException;

/**
 * @author Dmitry Zvezdov
 *         17.04.17.
 */
public class Turkey implements AutoCloseable {
    @Override
    public void close() {

    }

    public static void main(String[] args) {
        try(
                Turkey turkey = new Turkey();
                ){

        }
    }
}
