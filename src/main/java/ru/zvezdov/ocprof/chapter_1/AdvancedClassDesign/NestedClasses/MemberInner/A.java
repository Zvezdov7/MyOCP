package ru.zvezdov.ocprof.chapter_1.AdvancedClassDesign.NestedClasses.MemberInner;

/**
 * @author Dmitry Zvezdov
 *         10.04.17.
 *
 *         Here is how to nest multiple classes and access
 *         a variable with the same name in each:
 *
 */
public class A {
    private int x = 10;
    class B{
        private int x = 20;
        class C{
            private int x = 30;
            public void allTheX(){
                System.out.println(x);          // 30
                System.out.println(this.x);     // 30
                System.out.println(B.this.x);   // 20
                System.out.println(A.this.x);   // 10
            }
        }
    }

    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();
        A.B.C c = b.new C();
        c.allTheX();
    }
}
