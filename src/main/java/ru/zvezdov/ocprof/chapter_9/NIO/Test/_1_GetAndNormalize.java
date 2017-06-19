package ru.zvezdov.ocprof.chapter_9.NIO.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Dmitry Zvezdov
 *         13.06.17.
 */
public class _1_GetAndNormalize {
    public static void main(String[] args) {
        Path path = Paths.get("/Users/../Desktop");
        System.out.println(path);
        path = path.normalize();
        System.out.println(path.toUri());

        path.getName(0);

    }
}
