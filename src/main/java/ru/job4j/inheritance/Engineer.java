package ru.job4j.inheritance;

public class Engineer extends Profession {
    private String tool;

    public Engineer(String name, String surname, String education, int birthday, String tool) {
        super(name, surname, education, birthday);
        this.tool = tool;
    }

    public String getTool() {
        return tool;
    }
}