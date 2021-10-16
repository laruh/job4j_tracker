package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int amount) {
        this.load = amount;
    }

    public void exchange(Battery another) {
        another.load += this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery battery = new Battery(70);
        Battery battery1 = new Battery(21);
        System.out.println("battery load: " + battery.load +". battery1 load: " + battery1.load);
        battery.exchange(battery1);
        System.out.println("battery load: " + battery.load + ". battery1 load: " + battery1.load);
    }
}