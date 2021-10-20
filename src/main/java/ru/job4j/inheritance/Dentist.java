package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private int teeth;

    public Dentist(String name, String surname, String education, boolean vaccine, int teeth) {
        super(name, surname, education, vaccine);
        this.teeth = teeth;
    }

    public int getTeeth() {
        return teeth;
    }
}