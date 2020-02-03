package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int statrt, int finish) {
        int min = array[statrt];
        for (; statrt <= finish; statrt++) {
            if (array[statrt] < min ) {
                min = array[statrt];
            }
        }
        return min;
    }
}
