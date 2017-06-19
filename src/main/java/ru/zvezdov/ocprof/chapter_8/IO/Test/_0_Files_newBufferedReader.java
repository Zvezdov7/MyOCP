package ru.zvezdov.ocprof.chapter_8.IO.Test;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Dmitry Zvezdov
 *         14.06.17.
 */
public class _0_Files_newBufferedReader {
    public static void main(String[] args) {
        Path path = Paths.get("/Users", "Zvezdov", "Desktop", "Hii");

        try (BufferedReader reader = Files.newBufferedReader(path)) {
            while (reader.ready()) {
                System.out.println(reader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
