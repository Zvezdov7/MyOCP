package ru.zvezdov.ocprof.chapter_8.IO.PlayGround;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Dmitry Zvezdov
 *         09.06.17.
 */
public class _0_InitInputStream {
    private static final String FILE_NAME = "/Users/Zvezdov/Desktop/Hi";

    private static void v1_readStream(InputStream input) throws IOException {
        while (true) {
                int oneByte = 0;
                if (oneByte != -1) {
                    oneByte = input.read();
                    System.out.print((char) oneByte);
                } else {
                    System.out.println("\nend");
                    break;
                }
        }
    }

    private static void v2_readStream(InputStream input) throws IOException {
        int oneByte = 0;
        while ((oneByte = input.read()) != -1) {
            System.out.print((char) oneByte);
        }
    }

    public static void main(String[] args) {
        InputStream stream = null;
        try {
            stream = new FileInputStream(FILE_NAME);
            v2_readStream(stream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
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
