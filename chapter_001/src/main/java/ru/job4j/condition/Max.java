package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
       return left > right ? left : right;
    }

    public static int max(int first, int second, int thrid) {
      return max(first, max(second, thrid));
    }

    public static int max(int first, int second, int thrid, int fourth) {
      return max(first, max(second, thrid, fourth));
    }
}
