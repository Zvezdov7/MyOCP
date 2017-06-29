package ru.zvezdov.ocprof.chapter_9.NIO.Test;

import sun.nio.cs.UTF_32;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Dmitry on 23.06.2017.
 */
public class _7_Files {
    public static void main(String[] args) {
        Path path1 = Paths.get("C:\\Users\\Dmitry\\Desktop\\f1.txt");
        Path path2 = Paths.get("C:\\Users\\Dmitry\\Desktop\\f2.txt");
        Path path3 = Paths.get("C:\\Users\\Dmitry\\Desktop\\f3.txt");
//        Path path3 = Paths.get("C:\\Users\\Dmitry\\Desktop");

        /*
        By default, the copy fails if the target file already exists or is a symbolic link,
        except if the source and target are the same file,
        in which case the method completes without copying the file.
         */
        try {
//            Files.copy(path1, path2, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.COPY_ATTRIBUTES);
//            Files.delete(path2);
//            System.out.println(Files.deleteIfExists(path2));
//            Stream<Path> pathStream = Files.find(path3, 2, (a, b) -> b.isDirectory());
//            pathStream.forEach(path -> System.out.println(path.getFileName()));
            Stream<String> lines = Files.lines(path1, Charset.defaultCharset());
            BufferedReader bufferedReader1 = Files.newBufferedReader(path1);
            BufferedReader bufferedReader2 = Files.newBufferedReader(path2);

            BufferedWriter bufferedWriter = Files.newBufferedWriter(path3);
            while (bufferedReader1.ready()) {
                bufferedWriter.write(bufferedReader1.readLine() + bufferedReader2.readLine());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
//            List<String> phrases = new ArrayList<>();
//            StringBuilder stringBuilder = new StringBuilder();
//            lines.forEach(System.out::println);
//            lines.forEach(s -> {
//                if (s.equals("")) {
//                    phrases.add(stringBuilder.toString());
//                    stringBuilder.setLength(0);
//                } else {
//                    stringBuilder.append(s);
//                }
//            });
//            System.out.println(phrases);

//        Files.exists(path1);

//            Stream<Path> walk = Files.walk(path3);
//            walk.forEach(System.out::println);

//        Files.walkFileTree(path3, );

            System.out.println(FileSystems.getDefault().getPath("s","d").toAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
