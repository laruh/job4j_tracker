package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private int stamina;

    public Surgeon(String name, String surname, String education,
                   int birthday, boolean vaccine, int stamina) {
        super(name, surname, education, birthday, vaccine);
        this.stamina = stamina;
    }

    public int getStamina() {
        return stamina;
    }
}