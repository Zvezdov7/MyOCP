package ru.zvezdov.ocprof.chapter_1.AdvancedClassDesign.VirtulaMethodInvocation;

/**
 * @author Dmitry Zvezdov
 *         07.04.17.
 */
public abstract class AbstractAnimal {
    String name = "???";

    public void printName(){
        System.out.println(name);
    }

    public abstract void feed();

    public void careFor(){
        play();
    }

    public void play(){
        System.out.println("pet animal");
    }
}
