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
public class NewApproach {
    public static void main(String[] args) throws IOException{
        Path path1 = Paths.get("");
        Path path2 = Paths.get("");

        try(
                BufferedReader in = Files.newBufferedReader(path1);
                BufferedWriter out = Files.newBufferedWriter(path2)
        ){
            out.write(in.readLine());
        }
    }
}
