package ru.zvezdov.ocprof.chapter_8.IO.Basic;

import java.io.File;
import java.io.IOException;

/**
 * @author Dmitry Zvezdov
 *         11.06.17.
 */
public class _0_FileClass {
    public static void main(String[] args) throws IOException {
        File[] roots = File.listRoots(); // Возвращает массив с корнем (корнями) системы

        /*  Plain file  */
//        File file = new File("/Users/Zvezdov/Desktop/Hi"); //
//        System.out.println(file.exists());
//        System.out.println(file.getName());
//        System.out.println(file.canExecute());
//        System.out.println(file.canRead());
//        System.out.println(file.canWrite());
//        System.out.println(file.toString());
//        System.out.println(file.getAbsoluteFile());
//        System.out.println(file.getCanonicalFile());
//        System.out.println(file.getCanonicalPath());
//        System.out.println(file.getFreeSpace() / (1024 * 1024));
//        System.out.println(file.getTotalSpace() / (1024 * 1024));
//        System.out.println(file.getUsableSpace() / (1024 * 1024));
//        System.out.println(File.separator);

        /*  Directory   */
        File directory = new File("/Users/Zvezdov/Desktop/dira/dir");
        System.out.println(directory.exists());




    }
}
