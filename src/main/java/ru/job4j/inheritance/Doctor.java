package ru.job4j.inheritance;

public class Doctor extends Profession{
    private boolean vaccina;

    public Doctor() {}

    public Doctor(String name, String surname, String education, int birthday, boolean vaccina) {
        super(name, surname, education, birthday);
        this.vaccina = vaccina;
    }

    public String vaccination(boolean vaccina) {
        return vaccina ? "Прививка есть" : "Нужно привиться";
    }

    public boolean getVaccina() {
        return vaccina;
    }
}