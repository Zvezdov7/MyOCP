package ru.zvezdov.ocprof.chapter_8.IO.Serialization;

import java.io.*;

/**
 * Created by Dmitry on 22.06.2017.
 */
public class SomeClassForSer extends ParentSer implements Serializable { // NotSerializableException
    int i = 10;
    String string = "Hello";
    final int b = 100;
    transient int k = 1000;
    static int m = 10000;
    static String statStr = "static";
//    Box box = new Box(); //NotSerializableException

    public static void main(String[] args) {
        try(
                ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Dmitry\\Desktop\\file.txt"));
                ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\Dmitry\\Desktop\\file.txt"))
                ) {
            SomeClassForSer obj = new SomeClassForSer();
            outputStream.defaultWriteObject();
            outputStream.writeObject(obj);
//            outputStream.writeUTF("");

            SomeClassForSer someClassForSer = (SomeClassForSer) inputStream.readObject();
            System.out.println(someClassForSer.stringPar);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class ParentSer implements Serializable {
    String stringPar = "parent";
}

class Box {}
