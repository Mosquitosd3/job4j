package ru.job4j.io;

import java.util.Scanner;
import java.util.Random;

public class MagicBall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int outPut = random.nextInt(3);
        System.out.print("Что ты хочешь узнать? ");
        String input = scanner.nextLine();
        switch (outPut) {
            case (0) :
                System.out.println("Да");
                break;
            case (1) :
                System.out.println("Нет");
                break;
            default:
                System.out.println("Может быть");
        }
    }
}
