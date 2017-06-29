package ru.zvezdov.ocprof.chapter_1.AdvancedClassDesign.Test;

/**
 * Created by Dmitry on 20.06.2017.
 */
public class _4_ValidEnums {
    public enum EnumBBB {B, BB, BBB};
    public class Inner {
//        enum EnumCCC {C, CC, CCC}; // Compilation Error (Inner class can not have static declaration)
    }
    public static enum EnumDDD {D, DD, DDD};

//    public void methodA() { enum EnumEEE {E, EE, EEE} } // Compilation Error (Enum must not be local)
//    public static void methodB() { enum EnumFFF {F, FF, FFF} } // Compilation Error (Enum must not be local)
}
//public enum EnumAAA {} // Compilation Error
