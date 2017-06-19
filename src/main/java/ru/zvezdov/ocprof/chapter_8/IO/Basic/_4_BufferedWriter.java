package ru.zvezdov.ocprof.chapter_8.IO.Basic;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Dmitry Zvezdov
 *         13.06.17.
 */
public class _4_BufferedWriter {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("/Users/Zvezdov/Desktop/buf");
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write("Hello");
            bufferedWriter.newLine();
            bufferedWriter.write("World");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
