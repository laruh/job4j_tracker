package ru.job4j.inheritance;

public class Profession {
    private String name;

    private String surname;

    private String education;

    private int birthday;

    public Profession(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}