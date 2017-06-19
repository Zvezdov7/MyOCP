package ru.zvezdov.ocprof.chapter_8.IO.PlayGround;

import java.io.*;
import java.sql.PreparedStatement;
import java.util.NoSuchElementException;

/**
 * @author Dmitry Zvezdov
 *         14.06.17.
 */
public class _2_DataOutput {
    public static void main(String[] args) {
        Item item = new Item(1, "Arrrrr", new int[]{1, 2, 3});

        File file = new File("/Users/Zvezdov/Desktop/item.txt");
        try (   BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                DataOutputStream dataOutputStream = new DataOutputStream(bufferedOutputStream)) {
            dataOutputStream.writeInt(item.number);
            dataOutputStream.writeUTF(item.name);
            dataOutputStream.writeInt(item.arr.length);
            for (int i : item.arr) {
                dataOutputStream.writeInt(i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
class Item {
    int number;
    String name;
    int[] arr;

    public Item(int number, String name, int[] arr) {
        this.number = number;
        this.name = name;
        this.arr = arr;
    }
}
