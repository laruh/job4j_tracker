package ru.job4j.inheritance;

public class Engineer extends Profession {
    private String tool;

    private int year;

    public Engineer(String name, String tool, int year) {
        super(name);
        this.tool = tool;
        this.year = year;
    }

    private void getExperience(String tool, int year) {
        System.out.println("Опыт использования инструментом" + tool + " " + year + " лет");
    }
}