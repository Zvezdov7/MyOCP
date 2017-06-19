package ru.zvezdov.ocprof.chapter_9.NIO.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * @author Dmitry Zvezdov
 *         14.06.17.
 */
public class _3_CopyFile {
    public static void main(String[] args) throws IOException {
        Path path1 = Paths.get("/Users/Zvezdov/Desktop/Hi");
        Path path2 = Paths.get("/Users/Zvezdov/Desktop/Ho");
        Files.copy(path1, path2, StandardCopyOption.COPY_ATTRIBUTES , StandardCopyOption.REPLACE_EXISTING);
        System.out.println(Files.isSameFile(path1, path2));

    }
}
