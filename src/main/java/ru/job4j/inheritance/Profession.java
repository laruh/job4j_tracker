package ru.job4j.inheritance;

public class Profession {
    private String name;

    private String surname;

    private String education;

    private int birthday;

    public Profession () {}

    public Profession(String name, String surname, String education, int birthday) {
        this.name = name;
        this.surname = name;
        this.education = education;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }
 }