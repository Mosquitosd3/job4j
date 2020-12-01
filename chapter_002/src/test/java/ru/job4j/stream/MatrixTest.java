package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MatrixTest {

    @Test
    public void matrixToList() {
        Integer[][] input = {{1, 2, 3}, {4, 5, 6}};
        List<Integer> expect = List.of(1, 2, 3, 4, 5, 6);
        Matrix m = new Matrix();
        List<Integer> rsl = m.matrixToList(input);
        assertThat(rsl, is(expect));
    }
}