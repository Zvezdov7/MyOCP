package ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Collections.ComparableVsComparator.Comparator;

import java.util.Comparator;

/**
 * @author Dmitry Zvezdov
 *         13.04.17.
 */
public class Squirrel {
    private int weight;
    private String species;

    public Squirrel(String species) {
        if (species == null) throw new IllegalArgumentException();
        this.species = species;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public static void main(String[] args) {

//        Comparator<Squirrel> multiFieldComaparator = new Comparator<Squirrel>() {
//            @Override
//            public int compare(Squirrel o1, Squirrel o2) {
//                int result = o1.getSpecies().compareTo(o2.getSpecies());
//                if (result != 0) return result;
//                return o1.getWeight()-o2.getWeight();
//            }
//        };

        Comparator<Squirrel> chainingComparator = new Comparator<Squirrel>() {
            @Override
            public int compare(Squirrel o1, Squirrel o2) {
//                Comparator<Squirrel> c = Comparator.comparing(o -> o.getSpecies());
                Comparator<Squirrel> c = Comparator.comparing(Squirrel::getSpecies);
//                c.thenComparingInt(o -> o.getWeight());
                c.thenComparingInt(Squirrel::getWeight);
                return c.compare(o1, o2);
            }
        };


    }
}
