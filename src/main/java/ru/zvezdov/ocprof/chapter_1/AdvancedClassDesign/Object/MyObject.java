package ru.zvezdov.ocprof.chapter_1.AdvancedClassDesign.Object;

/**
 * @author Dmitry Zvezdov
 *         25.04.17.
 */
public class MyObject {
    public String toString(){
        return myGetClass().getName() + "@" + Integer.toHexString(hashCode());
    }

    /*
        The native keyword is applied to a method to indicate that
        the method is implemented in native code using JNI(Java Native Interface).
     */
    public native int hashCode();

    public boolean equals(MyObject o){
        return (this == o);
    }

    public final native Class myGetClass();

    public native MyObject clone() throws CloneNotSupportedException;

    protected void finalize() throws Throwable{}

    public final native void myNotify();
    public final native void myNotifyAll();
    public final native void myWait() throws InterruptedException;

}
