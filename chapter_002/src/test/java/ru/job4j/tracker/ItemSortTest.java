package ru.job4j.tracker;

import org.junit.Test;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ItemSortTest {
    @Test
    public void whenUpSort() {
        List<Item> input = Arrays.asList(
                new Item("c"),
                new Item("e"),
                new Item("a"),
                new Item("d"),
                new Item("b")
        );
        List<Item> expect = Arrays.asList(
                new Item("a"),
                new Item("b"),
                new Item("c"),
                new Item("d"),
                new Item("e")
        );
        Collections.sort(input, new sortByUp());
        assertThat(input, is(expect));
    }

    @Test
    public void whenSortDown() {
        List<Item> input = Arrays.asList(
                new Item("c"),
                new Item("e"),
                new Item("a"),
                new Item("d"),
                new Item("b")
        );
        List<Item> expect = Arrays.asList(
                new Item("e"),
                new Item("d"),
                new Item("c"),
                new Item("b"),
                new Item("a")
        );
        Collections.sort(input, new sortByDown());
        assertThat(input, is(expect));
    }
}