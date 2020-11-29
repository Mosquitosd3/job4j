package ru.job4j.stream;

import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ListToMapTest {

    @Test
    public void studentToMap() {
        ListToMap listToMap = new ListToMap();
        List<Student> input = List.of(
                new Student(60, "Surname1"),
                new Student(10, "Surname2"),
                new Student(30, "Surname3"),
                new Student(40, "Surname4")
        );
        Map<String, Student> expect = Map.of(
                input.get(0).getSurname(), input.get(0),
                input.get(1).getSurname(), input.get(1),
                input.get(2).getSurname(), input.get(2),
                input.get(3).getSurname(), input.get(3)
        );
        Map<String, Student> rsl = listToMap.studentToMap(input);
        assertThat(rsl, is(expect));
    }
}