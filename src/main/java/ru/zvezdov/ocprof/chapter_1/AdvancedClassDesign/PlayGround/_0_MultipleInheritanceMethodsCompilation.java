package ru.zvezdov.ocprof.chapter_1.AdvancedClassDesign.PlayGround;

/**
 * @author Dmitry Zvezdov
 *         10.06.17.
 */
public class _0_MultipleInheritanceMethodsCompilation {
    public static void main(String[] args) {
        House building = new Foo();
        System.out.println(building.getAddress());

    }
}

interface House {
    default String getAddress() {
        return "Str1";
    }
}

interface Office {
    static String getAddress() {
        return "Str2";
    }
}

interface Building extends House, Office {
}

class Foo implements House, Office {
    public String getAddress() {
        return "Str3";
    }
}

interface Stat {
    static void go() {}
}

class StatCh implements Stat {

}
