package ru.zvezdov.ocprof.chapter_1.AdvancedClassDesign.StaticAndFinal;

/**
 * @author Dmitry Zvezdov
 *         09.05.17.
 */
public class StaticBlocks {
    public static void main(String[] args) {
        Blocks b;
        System.out.println("1");
        b = new Blocks();
        System.out.println("2");
        String string = new String();

        Blocks c = new Blocks();
    }

    public static long getLong(int i){
        return i;
    }
}

class Blocks{
    static {
        System.out.println("I'm statis");
    }
    {
        System.out.println("I'm non-static");
    }
}
