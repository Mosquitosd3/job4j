package ru.job4j.calculator;

/**
 * Calculate.
 *
 * @author Nikolya Gotbunkov (Mosquitod3@yandex.ru)
 */
public class Calculator {
    /**
     *Cложение
     * @param first
     * @param second
     */
    public static void add(double first, double second) {
        double result = first + second;
        System.out.println(first + " + " + second + " = " + result);
    }

    /**
     * Деление
     * @param first
     * @param second
     */
    public static void div(double first, double second) {
        double result = first / second;
        System.out.println(first + " / " + second + " = " + result);
    }

    /**
     * Умножение
     * @param first
     * @param second
     */
    public static void multiply(double first, double second) {
        double result = first * second;
        System.out.println(first + " * " + second + " = " + result);
    }

    /**
     *Вычитание
     * @param first
     * @param second
     */
    public static void subtrack(double first, double second) {
        double result = first - second;
        System.out.println(first + " - " + second + " = " + result);
    }

    /**
     * main
     * @param args
     */
    public static void main(String[] args) {
        add(1, 1);
        div(4, 2);
        multiply(2, 1);
        subtrack(10, 5);
    }
}
