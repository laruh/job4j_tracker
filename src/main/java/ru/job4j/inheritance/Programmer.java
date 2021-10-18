package ru.job4j.inheritance;

public class Programmer extends Engineer{
    private int sleeping;

    public Programmer() {}

    public Programmer(String name, String surname, String education, int birthday, String tool, int year, int sleeping) {
        super(name, surname, education, birthday, tool, year);
        this.sleeping = sleeping;
    }

    public int getSleeping() {
        return sleeping;
    }
}