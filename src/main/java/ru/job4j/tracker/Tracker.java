package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] itemsWithoutNull = new Item[size];
        int length = 0;
        for (int i = 0; i < size; i++) {
            Item item = items[i];
            if (item != null) {
                itemsWithoutNull[length] = item;
                length++;
            }
        }
        itemsWithoutNull = Arrays.copyOf(itemsWithoutNull, length);
        return itemsWithoutNull;
    }

    public Item[] findByName(String key) {
        Item[] itemsByName = new Item[size];
        int length = 0;
        for (int i = 0; i < size; i++) {
            Item item = items[i];
            if (key.equals(item.getName())) {
                itemsByName[length] = item;
                length++;
            }
        }
        itemsByName = Arrays.copyOf(itemsByName, length);
        return itemsByName;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        if (index != -1) {
            item.setId(id);
            items[index] = item;
            return true;
        } else {
            return false;
        }
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        if (index != -1) {
            System.arraycopy(items, index + 1, items, index, size - index - 1);
            items[size - 1] = null;
            size--;
            return true;
        } else {
            return false;
        }
    }
}