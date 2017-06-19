package ru.zvezdov.ocprof.chapter_1.AdvancedClassDesign.AbstractClasses;

/**
 * @author Dmitry Zvezdov
 *         03.05.17.
 */
public interface WithoutMethod {
    void m();
    default int method(){return 1;}
}
interface i22 extends WithoutMethod{

}

