package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ItemSorter {
    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item(3, "Socks"),
                new Item(1, "Flag"),
                new Item(8, "Pigeon")
        );
        System.out.println(items);
        Collections.sort(items);
        System.out.println(items);
        Collections.sort(items, Collections.reverseOrder());
        System.out.println(items);
        Collections.sort(items, new SortByNameItem());
        System.out.println(items);
    }
}
