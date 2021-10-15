package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }

    public static void main(String[] args) {
        DummyDic vocabulary = new DummyDic();
        String word = "Unknown word.";
        String translate = vocabulary.engToRus(word);
        System.out.println(translate);
    }
}