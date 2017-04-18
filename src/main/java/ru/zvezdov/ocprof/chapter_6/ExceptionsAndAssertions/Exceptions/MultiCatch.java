package ru.zvezdov.ocprof.chapter_6.ExceptionsAndAssertions.Exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.MissingResourceException;

/**
 * @author Dmitry Zvezdov
 *         17.04.17.
 */
public class MultiCatch {
    public static void main(String[] args) {

        try {
            mightThrow();
        } catch (FileNotFoundException | IllegalStateException e){
        } catch (InputMismatchException | MissingResourceException e){
        } catch (ArrayIndexOutOfBoundsException e){
        } catch (IOException e){
        } catch (Exception e){
        }
    }

    private static void mightThrow() throws DateTimeParseException, IOException {
    }


}
