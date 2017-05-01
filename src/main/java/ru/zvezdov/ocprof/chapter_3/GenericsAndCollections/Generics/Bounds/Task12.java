package ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Generics.Bounds;

/**
 * @author Dmitry Zvezdov
 *         24.04.17.
 */
public class Task12 {
    public static <U extends Exception> void  printException(U u){
        System.out.println(u.getMessage());
    }

    public static void main(String[] args) {
        Task12.printException(new Exception("1"));
//        Task12.printException(new Throwable("2")); // Compilation Error
//        Task12.<Throwable>printException(new Exception("3")); // Compilation Error
        Task12.<RuntimeException>printException(new NullPointerException("3"));
    }
}
