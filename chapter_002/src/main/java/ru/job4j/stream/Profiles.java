package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    public List<Address> collect(List<Profile> profiles) {
        List<Address> rsl = profiles.stream()
                            .map(Profile::getAddress)
                            .sorted((o1, o2) -> o1.getCity().compareTo(o2.getCity()))
                            .distinct().collect(Collectors.toList());
        return rsl;
    }
}
