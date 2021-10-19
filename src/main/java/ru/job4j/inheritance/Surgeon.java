package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private int stamina;

    public Surgeon(String name, boolean vaccine, int stamina) {
        super(name, vaccine);
        this.stamina = stamina;
    }

    public int getStamina() {
        return stamina;
    }
}