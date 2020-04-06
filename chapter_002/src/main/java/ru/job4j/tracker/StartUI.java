package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.println("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ===");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                Item[] item = tracker.findAll();
                System.out.println("=== All Items ===");
                for (int index = 0; index < item.length; index++) {
                    System.out.println("Item Name: "
                                    + item[index].getName() + " id: "
                                    + item[index].getId()
                    );
                }
            } else if (select == 2) {
                System.out.println("=== Replace Item ===");
                System.out.print("Enter id: ");
                String id = scanner.nextLine();
                System.out.print("Enter new name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                if (tracker.replace(id, item)) {
                    System.out.println("Replacement successful.");
                } else {
                    System.out.println("Replacement failed.");
                }
            } else if (select == 3) {
                System.out.println("=== Delete Item ===");
                System.out.print("Enter id: ");
                String id = scanner.nextLine();
                if (tracker.delete(id)) {
                    System.out.println("Delete successful");
                } else {
                    System.out.println("Delete failed");
                }
            } else if (select == 4) {
                System.out.println("=== Find item by Id ===");
                System.out.print("Enter id: ");
                String id = scanner.nextLine();
                Item item = tracker.findById(id);
                System.out.println("Item name: " + item.getName() + " ;" + " Item id: " + item.getId() + ".");
            } else if (select == 5) {
                System.out.println("=== Find items by name ===");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item[] allNameFind = tracker.findByName(name);
                for (int index = 0; index < allNameFind.length; index++) {
                    System.out.println("Name: " + allNameFind[index].getName()
                                        + ";" + "id: " + allNameFind[index].getId() + "."
                    );
                }
            } else if (select == 6) {
                System.out.println("=== Exit programm ===");
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
