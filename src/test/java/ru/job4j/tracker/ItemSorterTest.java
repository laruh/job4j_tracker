package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import static org.junit.Assert.*;

public class ItemSorterTest {

    @Test
    public void sort() {
        List<Item> items = Arrays.asList(
                new Item(3, "Cube"),
                new Item(1, "Paper"),
                new Item(2, "Laptop"),
                new Item(9, "Window")
        );
        List<Item> expected = Arrays.asList(
                new Item(1, "Paper"),
                new Item(2, "Laptop"),
                new Item(3, "Cube"),
                new Item(9, "Window")
        );
        Collections.sort(items);
        assertEquals(items, expected);
    }

    @Test
    public void sortReverse() {
        List<Item> items = Arrays.asList(
                new Item(3, "Cube"),
                new Item(1, "Paper"),
                new Item(2, "Laptop"),
                new Item(9, "Window")
        );
        List<Item> expected = Arrays.asList(
                new Item(9, "Window"),
                new Item(3, "Cube"),
                new Item(2, "Laptop"),
                new Item(1, "Paper")
        );
        Collections.sort(items, new SortReverseItem());
        assertEquals(items, expected);
    }

    @Test
    public void sortByName() {
        List<Item> items = Arrays.asList(
                new Item(3, "Cube"),
                new Item(1, "Paper"),
                new Item(2, "Laptop"),
                new Item(9, "Window")
        );
        List<Item> expected = Arrays.asList(
                new Item(3, "Cube"),
                new Item(2, "Laptop"),
                new Item(1, "Paper"),
                new Item(9, "Window")
        );
        Collections.sort(items, new SortByNameItem());
        assertEquals(items, expected);

    }
}