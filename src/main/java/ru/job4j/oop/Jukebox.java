package ru.job4j.oop;

public class Jukebox {
    public void music(int posision) {
        if (posision == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (posision == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox continental = new Jukebox();
        continental.music(1);
        continental.music(2);
        continental.music(3);
    }
}