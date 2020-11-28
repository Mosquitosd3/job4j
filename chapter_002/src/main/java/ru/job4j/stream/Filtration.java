package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filtration {
    public static void main(String[] args) {
        List<Integer> list = List.of(-3, 5, -7, 10, 11, -1);
        listNoNegative(list).forEach(System.out::println);
    }

    public static List<Integer> listNoNegative(List<Integer> list) {
        List<Integer> rsl = list.stream().filter(number -> number > 0).collect(Collectors.toList());
        return rsl;
    }
}
