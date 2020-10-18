import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        boolean run = true;
        System.out.println("Введите пример, например 2+2 или II*IX :");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        InputUser inputUser = new InputUser(input);
        String operation = inputUser.Operation();

            switch (operation) {
                case ("+"):
                    new Addition(inputUser).sum();
                    break;
                case ("-"):
                    new Difference(inputUser).subtraction();
                    break;
                case ("*"):
                    new Multiplication(inputUser).multiplier();
                    break;
                case ("/"):
                   new Division(inputUser).divider();
                    break;
            }

    }
}
