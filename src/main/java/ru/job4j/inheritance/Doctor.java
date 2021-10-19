package ru.job4j.inheritance;

public class Doctor extends Profession {
    private boolean vaccine;

    public Doctor(String name, String surname, String education, int birthday, boolean vaccine) {
        super(name, surname, education, birthday);
        this.vaccine = vaccine;
    }

    public String vaccination(boolean vaccine) {
        return vaccine ? "Прививка есть" : "Нужно привиться";
    }

    public boolean getVaccine() {
        return vaccine;
    }
}