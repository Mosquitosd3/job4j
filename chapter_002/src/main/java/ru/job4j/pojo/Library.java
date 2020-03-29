package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book headFirstJava = new Book("Head First Java", 708);
        Book thinkingInJava = new Book("Thinking in java", 1164);
        Book cleanCode = new Book("Clean code", 464);
        Book headFirstPatterns = new Book("Head First Patterns", 657);

        Book[] lidrary = new Book[4];

        lidrary[0] = headFirstJava;
        lidrary[1] = thinkingInJava;
        lidrary[2] = cleanCode;
        lidrary[3] = headFirstPatterns;

        for (int index = 0; index < lidrary.length; index++) {
            Book book = lidrary[index];
            System.out.println(book.getName() + " - " + "Страниц : " + book.getPages());
        }

        Book temp = headFirstJava;
        lidrary[0] = lidrary[3];
        lidrary[3] = temp;

        System.out.println("Replace book");

        for (int index = 0; index < lidrary.length; index++) {
            Book book = lidrary[index];
            System.out.println(book.getName() + " - " + "Страниц : " + book.getPages());
        }

        System.out.println("Search Book name \"Clean code\".");

        for (int index = 0; index < lidrary.length; index++) {
            Book book = lidrary[index];
            if (book.equals(cleanCode)) {
                System.out.println(book.getName() + " - " + "Страниц : " + book.getPages());
            }
        }
    }
}
