package ru.zvezdov.ocprof.chapter_1.AdvancedClassDesign.VirtulaMethodInvocation;

/**
 * @author Dmitry Zvezdov
 *         07.04.17.
 */
public class Lion extends AbstractAnimal {

    String name = "Leo";

    @Override
    public void printName() {
        System.out.println(name);
    }

    @Override
    public void feed() {
        addMeat();
    }

    private void addMeat(){

    }

    @Override
    public void play() {
        System.out.println("toss in meat");
    }
}
