package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matches = 11;
        boolean run = true;
        System.out.println("На столе : " + matches + " спичек.");
        while (run) {
            System.out.println("Игрок 1: Возьмите от 1 до 3 спичек");
            int player1 = Integer.valueOf(scanner.nextLine());
            matches -= player1;
            if (matches == 0) {
                System.out.println("Победил: Player 1 !");
                break;
            }
            System.out.println("Игрок 2: Возьмите от 1 до 3 спичек");
            int player2 = Integer.valueOf(scanner.nextLine());
            matches -= player1;
            if (matches <= 0) {
                System.out.println("Победил: Player 2 !");
                break;
            }
            System.out.println("На столе осталось : " + matches + " Спичек");
        }
    }
}
