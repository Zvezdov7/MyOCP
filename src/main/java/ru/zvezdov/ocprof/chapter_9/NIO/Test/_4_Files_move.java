package ru.zvezdov.ocprof.chapter_9.NIO.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * @author Dmitry Zvezdov
 *         15.06.17.
 */
public class _4_Files_move {
    public static void main(String[] args) {
        Path path1 = Paths.get("");
        Path path2 = Paths.get("");
        try {
            Files.move(path1, path2, StandardCopyOption.ATOMIC_MOVE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
