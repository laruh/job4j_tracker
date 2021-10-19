package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private int sleeping;

    public Programmer(String name, String tool, int year, int sleeping) {
        super(name, tool, year);
        this.sleeping = sleeping;
    }

    public int getSleeping() {
        return sleeping;
    }
}