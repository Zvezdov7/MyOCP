package ru.zvezdov.ocprof.chapter_1.AdvancedClassDesign.Object.ToString;

/**
 * @author Dmitry Zvezdov
 *         07.04.17.
 */
public class Hippo {
    private String name;
    private double weight;

    public Hippo(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Hippo{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public static void main(String[] args) {
        Hippo hippo = new Hippo("Harry", 3100);
        System.out.println(hippo);
    }
}
