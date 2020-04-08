package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {
    @Test
    public void whenAddItem() {
        String[] answer = {"Fix PC"};
        Input input = new StubInput(answer);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item create = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(create.getName(), is(expected.getName()));
    }
}
