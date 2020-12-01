package ru.job4j.stream;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Matrix {
    public List<Integer> matrixToList(Integer[][] array) {
        return Arrays.stream(array).flatMap(a -> Arrays.stream(a)).collect(Collectors.toList());
    }
}
