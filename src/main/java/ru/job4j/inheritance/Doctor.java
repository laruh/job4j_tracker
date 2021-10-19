package ru.job4j.inheritance;

public class Doctor extends Profession {
    private boolean vaccine;

    public Doctor(String name, boolean vaccine) {
        super(name);
        this.vaccine = vaccine;
    }

    public String vaccination(boolean vaccine) {
        return vaccine ? "Прививка есть" : "Нужно привиться";
    }

    public boolean getVaccine() {
        return vaccine;
    }
}