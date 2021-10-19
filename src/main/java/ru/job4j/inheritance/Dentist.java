package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private int teeth;

    public Dentist(String name, boolean vaccine, int teeth) {
        super(name, vaccine);
        this.teeth = teeth;
    }

    public int getTeeth() {
        return teeth;
    }
}