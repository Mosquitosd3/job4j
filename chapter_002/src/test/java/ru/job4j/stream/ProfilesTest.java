package ru.job4j.stream;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProfilesTest {
    @Test
    public void collect() {
        Profiles profiles = new Profiles();
        List<Address> expect = List.of(
                new Address("London", "Baker street", 221, 1),
                new Address("Donetsk", "Dobrovolscogo", 1, 14),
                new Address("Moscow", "Read square", 1, 1)
        );
        List<Profile> input = expect.stream().map(Profile::new).collect(Collectors.toList());
        List<Address> rsl = profiles.collect(input);
        assertThat(rsl, is(expect));
    }
}