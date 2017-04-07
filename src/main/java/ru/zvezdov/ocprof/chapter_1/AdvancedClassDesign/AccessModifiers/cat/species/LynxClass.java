package ru.zvezdov.ocprof.chapter_1.AdvancedClassDesign.AccessModifiers.cat.species;

import ru.zvezdov.ocprof.chapter_1.AdvancedClassDesign.AccessModifiers.cat.BigCatClass;

/**
 * @author Dmitry Zvezdov
 *         07.04.17.
 */
public class LynxClass extends BigCatClass {
    public static void main(String[] args) {
        BigCatClass catClass = new BigCatClass();
        System.out.println(catClass.name);
//        System.out.println(catClass.hasFur); // NOT COMPILE (protected)
//        System.out.println(catClass.hasPaws); // NOT COMPILE (default)
//        System.out.println(catClass.id); //  NOT COMPILE (private)

        LynxClass lynxClass = new LynxClass();
        System.out.println(lynxClass.name);
        System.out.println(lynxClass.hasFur); //COMPILE (protected)


    }
}
