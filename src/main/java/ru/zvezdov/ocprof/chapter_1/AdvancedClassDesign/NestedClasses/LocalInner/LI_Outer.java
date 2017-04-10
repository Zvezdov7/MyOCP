package ru.zvezdov.ocprof.chapter_1.AdvancedClassDesign.NestedClasses.LocalInner;

/**
 * @author Dmitry Zvezdov
 *         10.04.17.
 *
 *         A local inner class is a nested class defined within a method. Like local variables, a local
 *         inner class declaration does not exist until the method is invoked, and it goes out of scope
 *         when the method returns.
 *
 *         Local inner classes have the following properties:
 *         They do not have an access specifier.
 *         They cannot be declared static and cannot declare static fields or methods.
 *         They have access to all fields and methods of the enclosing class.
 *     !!! They do not have access to local variables of a method unless those variables are final
 *         or effectively final.
 */
public class LI_Outer {
    private int length = 5;
    public void calculate(){
        final int width = 20;
        class Inner {
            public void multiply(){
                System.out.println(length * width);
            }
        }
        Inner inner = new Inner();
        inner.multiply();
    }

    public static void main(String[] args) {
        LI_Outer outer = new LI_Outer();
        outer.calculate();
    }

    /*
     *  + One is effectively final. It is only set in the line in which it is declared.
     *  - Two is not effectively final. The value is changed on line 37 after it is declared.
     *  + Three is effectively final because it is assigned only once. This assignment may happen
     *    in either branch of the if statement, but it can happen in only one of them.
     *  - Four is not effectively final. Even though the assignment happens after the inner class,
     *    it is not allowed.
     */
    public void isItFinal(){
        int one = 20;
        int two = one;
        two++;
        int three;
        if (one == 4) three = 3;
        else three = 4;
        int four = 4;
        class Inner{ }
        four = 5;
    }

}
