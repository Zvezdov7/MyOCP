package ru.zvezdov.ocprof.chapter_5.DatesStringLocalization.String;

/**
 * @author Dmitry Zvezdov
 *         17.04.17.
 */
public class SomeClass {
    public static void main(String[] args) {
        String s1 = "bunny";
        String s2 = "bunny";
        String s3 = new String("bunny");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));

        String s4 = "1" + 2 + 3;
        String s5 = 1 + 2 + "3";
        System.out.println(s4);
        System.out.println(s5);

        String s = "abcde";
        System.out.println(s.trim().length());
        System.out.println(s.charAt(4));
        System.out.println(s.indexOf('e'));
        System.out.println(s.indexOf("de"));
        System.out.println(s.substring(2,4).toUpperCase());
        System.out.println(s.replace('a', '1'));
        System.out.println(s.contains("DE"));
        System.out.println(s.startsWith("a"));

        StringBuilder b = new StringBuilder();
        b.append(12345).append('-');
        System.out.println(b.length());
        System.out.println(b.indexOf("-"));
        System.out.println(b.charAt(2));
        System.out.println(b.capacity());

        StringBuilder b2 = b.reverse();
        System.out.println(b.toString());
        System.out.println(b);
        System.out.println(b == b2);



    }
}
