package ru.zvezdov.ocprof.chapter_1.AdvancedClassDesign.NestedClasses.MemberInner;

/**
 * @author Dmitry Zvezdov
 *         10.04.17.
 *         The interface itself does not have to be public, though. Just like any inner class, an inner
 *         interface can be private. This means that the interface can only be referred to within the
 *         current outer class.
 */
public class MI_PrivateInterface {
    public interface Secret {
        public void shh();
    }
    class DontTell implements Secret {

        @Override
        public void shh() {
            System.out.println("Shhh");
        }
    }
}

