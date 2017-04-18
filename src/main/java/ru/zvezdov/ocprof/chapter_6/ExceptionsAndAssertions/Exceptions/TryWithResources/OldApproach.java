package ru.zvezdov.ocprof.chapter_6.ExceptionsAndAssertions.Exceptions.TryWithResources;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Dmitry Zvezdov
 *         17.04.17.
 */
public class OldApproach {
    public static void main(String[] args) throws IOException {
        Path path1 = Paths.get("");
        Path path2 = Paths.get("");
        BufferedReader in = null;
        BufferedWriter out = null;
        try{
            in = Files.newBufferedReader(path1);
            out = Files.newBufferedWriter(path2);
            out.write(in.readLine());
        }finally {
            if (in != null) in.close();
            if (out != null) out.close();
        }
    }
}
