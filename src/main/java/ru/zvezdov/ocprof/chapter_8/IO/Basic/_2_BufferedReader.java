package ru.zvezdov.ocprof.chapter_8.IO.Basic;

import java.io.*;

/**
 * @author Dmitry Zvezdov
 *         11.06.17.
 */
public class _2_BufferedReader {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("/Users/Zvezdov/Desktop/Hi"))) {
            String string = null;
            while ((string = reader.readLine()) != null) {
                System.out.println(string);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
