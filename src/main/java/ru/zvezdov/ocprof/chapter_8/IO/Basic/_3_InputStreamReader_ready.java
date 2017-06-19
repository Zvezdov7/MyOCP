package ru.zvezdov.ocprof.chapter_8.IO.Basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Dmitry Zvezdov
 *         13.06.17.
 */
public class _3_InputStreamReader_ready {
    public static void main(String[] args) {
        try(FileInputStream fileInputStream = new FileInputStream("/Users/Zvezdov/Desktop/Hi");
            InputStreamReader reader = new InputStreamReader(fileInputStream)) {
            while (reader.ready()) {
                int read = reader.read();
                System.out.println((char) read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
