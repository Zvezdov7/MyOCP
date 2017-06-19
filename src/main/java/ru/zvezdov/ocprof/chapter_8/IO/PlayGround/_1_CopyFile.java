package ru.zvezdov.ocprof.chapter_8.IO.PlayGround;

import java.io.*;

/**
 * @author Dmitry Zvezdov
 *         12.06.17.
 */
public class _1_CopyFile {
    public static void main(String[] args) {
        String fileFrom = "/Users/Zvezdov/Desktop/Hi";
        String fileTo = "/Users/Zvezdov/Desktop/Hey";
        long timeFrom = System.nanoTime();
        _1_CopyFile.copy(fileFrom, fileTo);
        long timeTo = System.nanoTime();
        System.out.println("Time: " + ((timeTo - timeFrom) / 1_000_000_0));
    }

    private static void copy(String fileFrom, String fileTo) {

        try (FileInputStream inputStream1 = new FileInputStream(fileFrom);
             FileOutputStream outputStream = new FileOutputStream(fileTo)) {
            copyStreams(inputStream1, outputStream, 64);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static void copyStreams(FileInputStream inputStream1, FileOutputStream outputStream, int buffSize) throws IOException {
        byte[] buff = new byte[buffSize];
        int count = 0;
        while ((count = inputStream1.read(buff)) != -1) {
            outputStream.write(buff, 0, count);
        }
    }
}
