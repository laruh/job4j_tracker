package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void go() {
        System.out.println("В пути");
    }

    @Override
    public void passengers(int num) {
        System.out.println("Количество пассажиров: " + num);
    }

    @Override
    public int refuel(int fuel) {
        int price = 50;
        return fuel < 5 ? (5 - fuel) * price : 0;
    }
}
