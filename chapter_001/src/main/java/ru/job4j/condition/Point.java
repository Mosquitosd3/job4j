package ru.job4j.condition;

public class Point {
    public static double distance(double x1, double y1, double x2, double y2) {
        double coordinates = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return coordinates;
    }

    public static void main(String[] args) {
        double result = distance(0, 0, 2, 0);
        System.out.println("result (0,0) to (2,0) " + result);

        double result2 = distance(-2.3, 4, 8.5, 0.7);
        System.out.println("result (-2.3, 4) to (8.5, 0.7) " + result2);
    }

}
