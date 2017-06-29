package ru.zvezdov.ocprof.chapter_4.FunctionalProgramming.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Dmitry Zvezdov
 *         14.06.17.
 */
public class _0_StreamApi_collect {
    public static void main(String[] args) {
        List<Item> list = Arrays.asList(
                new Item("ya",  1),
                new Item("on",  1),
                new Item("ona", 3),
                new Item("oni", 4)
        );

        list.stream().collect(Collectors.toList());
        list.stream().collect(Collectors.toSet());
        list.stream().collect(Collectors.toMap(Item::getName, Item::getNumber));
        list.stream().collect(Collectors.toCollection(ArrayList::new));
        list.stream().collect(Collectors.toCollection(HashSet::new));
//        list.stream().collect(Collectors.toCollection(TreeSet::new));
        Map<Integer, List<Item>> collect = list.stream().collect(Collectors.groupingBy((a) -> a.getNumber()));
        System.out.println(collect);
    }
}

class Item {
    String name;
    int number;

    public Item(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
