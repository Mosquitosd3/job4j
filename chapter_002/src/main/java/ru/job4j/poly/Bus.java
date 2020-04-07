package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void run() {
        boolean go = true;
    }

    @Override
    public void passengers(int count) {
        int passengers = count;
    }

    @Override
    public int refuel(int countFuel) {
        return countFuel * 50;
    }
}
