package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] ob1 = o1.split("/");
        String[] ob2 = o2.split("/");
        return ob1[0].equals(ob2[0]) ? o1.compareTo(o2) : ob2[0].compareTo(ob1[0]);
    }
}
