package ru.zvezdov.ocprof.chapter_1.AdvancedClassDesign.AccessModifiers.cat;

/**
 * @author Dmitry Zvezdov
 *         07.04.17.
 */
public class BigCatClass {
    public String name = "cat";
    protected boolean hasFur = true;
    boolean hasPaws = true;
    private  int id;

    public static void main(String[] args) {
        BigCatClass catClass = new BigCatClass();
        System.out.println(catClass.name);
        System.out.println(catClass.hasFur);
        System.out.println(catClass.hasPaws);
        System.out.println(catClass.id);

    }

}
