package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
    public Map<String, Student> studentToMap(List<Student> list) {
        Map<String, Student> rsl =
                list.stream()
                .distinct()
                .collect(Collectors.toMap(Student::getSurname, student -> student)
                );
        return rsl;
    }
}
