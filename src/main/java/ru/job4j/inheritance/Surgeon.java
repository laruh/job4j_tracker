package ru.job4j.inheritance;

public class Surgeon extends Doctor{
    private int stamina;

    public Surgeon() {}

    public Surgeon(String name, String surname, String education, int birthday, boolean vaccina, int stamina) {
        super(name, surname, education, birthday, vaccina);
        this.stamina = stamina;
    }

    public int getStamina() {
        return stamina;
    }
}