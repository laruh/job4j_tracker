package ru.job4j.inheritance;

public class Builder extends Engineer {
    private int buildings;

    public Builder(String name, String surname, String education,
                   int birthday, String tool, int buildings) {
        super(name, surname, education, birthday, tool);
        this.buildings = buildings;
    }

    public int getBuildings() {
        return buildings;
    }
}