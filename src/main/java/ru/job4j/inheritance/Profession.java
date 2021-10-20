package ru.job4j.inheritance;

public class Profession {
    private String name;

    private String surname;

    private String education;

    private int birthday;

    public Profession(String name, String surname, String education) {
        this.name = name;
        this.surname = surname;
        this.education = education;
    }

    public String getName() {
        return name;
    }
}