package ru.zvezdov.ocprof.chapter_9.NIO.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Dmitry on 20.06.2017.
 */
public class _6_ResolveSibling {
    public static void main(String[] args) {
        Path path1 = Paths.get("c:\\a\\b\\c");
        Path path2 = Paths.get("d");

        Path path3 = Paths.get("c:", path1.subpath(0,2).toString(), path2.toString());
        Path path4 = path1.resolveSibling(path2);
        System.out.println(path3);
        System.out.println(path4);
    }
}
