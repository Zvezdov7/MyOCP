package ru.zvezdov.ocprof.chapter_1.AdvancedClassDesign.OverloadingAndOverriding;

/**
 * @author Dmitry Zvezdov
 *         07.04.17.
 */
public class BobCatKitten extends BobCat {

    @Override
    public void findDen(){

    }

    @Override
    public int someNumber(){
        return 2;
    }
    /*
        Overloading method
     */
    public void findDen(boolean b){
    }

    /*
        Another method
     */
    public int findden() throws Exception{
        return 0;
    }
}
