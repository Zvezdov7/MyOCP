package ru.zvezdov.ocprof.chapter_1.AdvancedClassDesign.NestedClasses.MemberInner;

/**
 * @author Dmitry Zvezdov
 *         03.05.17.
 */
class A1 {
    int a = 0;
}


public class AccessTest {

    int at = 1;

    class Inner extends A1 {

        int at = 2;

        public Inner() {
            int at = 3;

            System.out.println(at);
            System.out.println(Inner.this.at);
            System.out.println(AccessTest.this.at);
            System.out.println(super.a);
        }
    }

    public static void main(String[] args) {
        new AccessTest().new Inner();
    }

}
