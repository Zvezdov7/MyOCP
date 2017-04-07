package ru.zvezdov.ocprof.chapter_1.AdvancedClassDesign.AccessModifiers.cat;

/**
 * @author Dmitry Zvezdov
 *         07.04.17.
 */
public class CatAdmirerClass {
    public static void main(String[] args) {
        BigCatClass catClass = new BigCatClass();
        System.out.println(catClass.name);
        System.out.println(catClass.hasFur); // COMPILE (protected) the same package
        System.out.println(catClass.hasPaws); // COMPILE (default) the same package
//        System.out.println(catClass.id); //  NOT COMPILE (private)

    }
}
