package ru.job4j.inheritance;

public class Dentist extends Doctor{
    private int teeth;

    public Dentist() {}

    public Dentist(String name, String surname, String education, int birthday, boolean vaccina, int teeth) {
        super(name, surname, education, birthday, vaccina);
        this.teeth = teeth;
    }

    public int getTeeth() {
        return teeth;
    }
}