package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static int dollarToRuble(int value) {
        return value * 60;
    }

    public static void main(String[] args) {

        int euro = rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " Euro");
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        int dollar = rubleToDollar(250);
        System.out.println("250 rubles are " + dollar + " Dollars");
        int in2 = 250;
        int expected2 = 4;
        int out2 = rubleToDollar(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("250 ruble are 4. Test result : " + passed2);

        int euroToRuble = euroToRuble(100);
        System.out.println("100 euro are " + euroToRuble + " Rubles");
        int in3 = 100;
        int expected3 = 7000;
        int out3 = euroToRuble(in3);
        boolean passed3 = expected3 == out3;
        System.out.println("100 euro are 7000. Test result : " + passed3);

        int dollarToRuble = dollarToRuble(400);
        System.out.println("400 dollars are " + dollarToRuble + " Rubles");
        int in4 = 400;
        int expected4 = 24000;
        int out4 = dollarToRuble(in4);
        boolean passed4 = expected4 == out4;
        System.out.println("400 dollars are 24000. Test result : " + passed4);
    }
}
