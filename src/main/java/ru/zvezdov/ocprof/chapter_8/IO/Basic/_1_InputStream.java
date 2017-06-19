package ru.zvezdov.ocprof.chapter_8.IO.Basic;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Dmitry Zvezdov
 *         11.06.17.
 */
public class _1_InputStream {
    public static void main(String[] args) {
        InputStream stream = null;
//        Reader reader = new FileReader("");
        try {
            stream = new FileInputStream("/Users/Zvezdov/Desktop/Hi");

            /*    Чтение по байтам    */
//            int oneByte;
//            while ((oneByte = stream. read()) != -1) {
//                System.out.print((char) oneByte);
//            }
//            stream.reset();
//            System.out.println("Finish");

            int num = 0;
            byte[] arr = new byte[20];
            while ((num = stream.read(arr)) != -1) {
            }
            for (byte b : arr) {
                System.out.println((char) b);
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (stream != null) {
                try {
                    stream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
