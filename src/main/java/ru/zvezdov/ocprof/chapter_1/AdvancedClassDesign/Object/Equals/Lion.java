package ru.zvezdov.ocprof.chapter_1.AdvancedClassDesign.Object.Equals;

/**
 * @author Dmitry Zvezdov
 *         07.04.17.
 */
public class Lion {
    private int id;
    private int age;
    private String name;

    public Lion(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Lion)) return false;
        Lion lion = (Lion) o;
        return this.id == lion.id;
    }

    // HashCode part //
    /*
        Legal
     */
    @Override
    public int hashCode(){
        return id;
    }

    /*
        Legal but not efficient
     */
//    @Override
//    public int hashCode(){
//        return 6;
//    }

    /*
        Not a overriding
     */
//    @Override
//    public long hashCode(){
//        return id;
//    }

    /*
        Illegal, becouse use more variables than equals();
     */
//    @Override
//    public int hashCode(){
//        return id * 7 + age;
//    }

}
