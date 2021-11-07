package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String el_or : origin) {
            check.add(el_or);
        }
        for ( String el_txt : text) {
            if (!check.contains(el_txt)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
