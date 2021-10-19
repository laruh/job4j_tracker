package ru.job4j.inheritance;

public class Builder extends Engineer {
    private int buildings;

    public Builder(String name, String tool, int year, int buildings) {
        super(name, tool, year);
        this.buildings = buildings;
    }

    public int getBuildings() {
        return buildings;
    }
}