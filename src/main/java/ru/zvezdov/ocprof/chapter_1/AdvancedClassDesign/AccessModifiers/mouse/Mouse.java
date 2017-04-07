package ru.zvezdov.ocprof.chapter_1.AdvancedClassDesign.AccessModifiers.mouse;

import ru.zvezdov.ocprof.chapter_1.AdvancedClassDesign.AccessModifiers.cat.BigCatClass;

/**
 * @author Dmitry Zvezdov
 *         07.04.17.
 */
public class Mouse {

    public static void main(String[] args) {
        BigCatClass catClass = new BigCatClass();
        System.out.println(catClass.name);
//        System.out.println(catClass.hasFur); // NOT COMPILE (protected)
//        System.out.println(catClass.hasPaws); // NOT COMPILE (default)
//        System.out.println(catClass.id); //  NOT COMPILE (private)

    }

}
