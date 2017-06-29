package ru.zvezdov.ocprof.chapter_9.NIO.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Dmitry on 20.06.2017.
 */
public class _5_Subpath {
    public static void main(String[] args) {
        Path path1 = Paths.get("/a/b/c");
        Path path2 = Paths.get("/f/e/d");
        System.out.println(path1.getName(0));
        System.out.println(path1.getName(1));
        System.out.println(path1.getName(2));
//        System.out.println(path1.getName(-1));
//        System.out.println(path1.getName(3));
//        System.out.println(path1.getName(4));
        System.out.println(path1.subpath(0, 2));

    }
}
