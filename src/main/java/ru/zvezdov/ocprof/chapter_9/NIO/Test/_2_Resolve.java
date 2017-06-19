package ru.zvezdov.ocprof.chapter_9.NIO.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Dmitry Zvezdov
 *         13.06.17.
 */
public class _2_Resolve {
    public static void main(String[] args) {
        Path path1 = Paths.get("/Users/Zvezdov/Desktop.txt");
        Path path2 = Paths.get("Hi");
        System.out.println(path1.resolve(path2));
    }
}
