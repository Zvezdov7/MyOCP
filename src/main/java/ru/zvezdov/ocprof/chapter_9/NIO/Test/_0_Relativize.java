package ru.zvezdov.ocprof.chapter_9.NIO.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Dmitry Zvezdov
 *         13.06.17.
 */
public class _0_Relativize {
    public static void main(String[] args) {
        Path path1 = Paths.get("Users/Zvezdov");
        Path path2 = Paths.get("EsbLoggingGui");
        Path path3 = path1.relativize(path2);
        System.out.println(path3);
    }

}
