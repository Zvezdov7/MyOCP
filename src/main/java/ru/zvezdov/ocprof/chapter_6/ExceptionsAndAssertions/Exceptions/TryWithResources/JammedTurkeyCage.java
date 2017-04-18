package ru.zvezdov.ocprof.chapter_6.ExceptionsAndAssertions.Exceptions.TryWithResources;

/**
 * @author Dmitry Zvezdov
 *         17.04.17.
 */
public class JammedTurkeyCage implements AutoCloseable {
    @Override
    public void close(){
        throw new IllegalStateException("Danger");
    }

    public static void main(String[] args) {
        try(
                JammedTurkeyCage turkeyCage = new JammedTurkeyCage();
                ){
            System.out.println("put it in");
            throw new IllegalStateException("Danger-danger");
        }catch (IllegalStateException e){
            System.out.println("Wow wow wow " + e.getMessage());
            for (Throwable throwable : e.getSuppressed()) {
                System.out.println(throwable.getMessage());
            }

        }
    }
}
