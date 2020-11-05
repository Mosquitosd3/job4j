package ru.job4j.tracker;



import java.util.*;

public class ItemSort {
    public static void main(String[] args) {
        List<Item> items = Arrays.asList(new Item("d"), new Item("a"), new Item("f"), new Item("e"));
        System.out.println(items);
        Collections.sort(items, new sortByUp());
        System.out.println(items);
        Collections.sort(items, new sortByDown());
        System.out.println(items);
    }
}
