package ru.zvezdov.ocprof.chapter_8.IO;

import java.io.BufferedWriter;
import java.io.Console;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Dmitry on 22.06.2017.
 */
public class ConsoleIO {
    public static void main(String[] args) throws IOException {
        Console console = System.console();
        console.printf("Yo");
        PrintWriter writer = console.writer();
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        bufferedWriter.write("MotherFuckers");

    }

}
