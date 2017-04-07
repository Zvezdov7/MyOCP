package ru.zvezdov.ocprof.chapter_1.AdvancedClassDesign.InstanceOf;

/**
 * @author Dmitry Zvezdov
 *         07.04.17.
 */
public class Animal {
    public static void main(String[] args) {
        Elephantenok elephantenok = new Elephantenok();
        Elephant elephant = new Elephant();
        Hipo hipo = new Hipo();

        System.out.println(elephantenok instanceof TopTop);
        System.out.println(elephantenok instanceof Animal);
        System.out.println(elephant instanceof Elephantenok);
    }
}
class HeavyAnimal extends Animal{
}
interface TopTop{}

class Elephant extends HeavyAnimal implements TopTop{}

class Elephantenok extends Elephant{}

class Hipo extends HeavyAnimal{}

