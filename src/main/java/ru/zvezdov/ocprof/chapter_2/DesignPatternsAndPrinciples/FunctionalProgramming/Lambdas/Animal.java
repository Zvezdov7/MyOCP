package ru.zvezdov.ocprof.chapter_2.DesignPatternsAndPrinciples.FunctionalProgramming.Lambdas;

/**
 * @author Dmitry Zvezdov
 *         10.04.17.
 */
public class Animal {
    private String species;
    private boolean canHop;
    private boolean canSwim;
    public Animal(String speciesName, boolean hopper, boolean swimmer){
        species = speciesName;
        canHop = hopper;
        canSwim = swimmer;
    }

    public boolean isCanHop() {
        return canHop;
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                '}';
    }
}
