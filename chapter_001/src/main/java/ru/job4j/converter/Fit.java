package ru.job4j.converter;

public class Fit {
    public static double manWeigth(double heigth) {
        return (heigth - 100) * 1.15;
    }

    public static double womanWeigth(double heigth) {
        return (heigth - 110) * 1.15;
    }

    public static void main(String[] args) {
        double man = manWeigth(100);
        System.out.println("Man 100 is " + man);

        double woman = womanWeigth(135);
        System.out.println("Woman 135 is " + woman);
    }

}
