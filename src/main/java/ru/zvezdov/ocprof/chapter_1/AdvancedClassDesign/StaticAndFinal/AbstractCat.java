package ru.zvezdov.ocprof.chapter_1.AdvancedClassDesign.StaticAndFinal;

/**
 * @author Dmitry Zvezdov
 *         07.04.17.
 */
public /*NO final*/ abstract class AbstractCat { // No final because abstract. No static because it is not an inner class
    static final String name = "The Cat";
    void clean(){ } // No static or final because overriding

}
