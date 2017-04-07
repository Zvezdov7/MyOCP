package ru.zvezdov.ocprof.chapter_1.AdvancedClassDesign.VirtulaMethodInvocation;


/**
 * @author Dmitry Zvezdov
 *         07.04.17.
 */
public class PlayWithAnimal {
    public static void main(String[] args) {
        AbstractAnimal animal = new Lion();

        /*
        Метод переопределяется в классе Lion,
        поэтому выведет "Leo", если бы переопределения небыло -
        получили бы "???"
         */
        animal.printName();

        /*
        Метод дергает внутри себя другой метод play(),
        который в свою очередь переопределяется классом Lion,
        поэтому выведет "toss in meat" а не "pet animal"
         */
        animal.careFor();
    }
}
