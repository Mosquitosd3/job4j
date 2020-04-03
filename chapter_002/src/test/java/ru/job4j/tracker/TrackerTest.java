package ru.job4j.tracker;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class TrackerTest {
    /**
     * Тест метод, для добавления нового Item И поиск по id.
     */
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    /**
     * Тест метод, для поиска всех Item без Null Элементов.
     */
    @Test
    public void findByAll() {
        Tracker tracker = new Tracker();
        Item first = new Item("first");
        Item second = new Item("second");
        tracker.add(first);
        tracker.add(second);
        Item[] expected = new Item[] {first, second};
        assertThat(expected, is(tracker.findAll()));
    }

    /**
     * Тест метод, для поиска Item по имени.
     */
    @Test
    public void findByName() {
        Tracker tracker = new Tracker();
        Item first = new Item("first");
        Item second = new Item("second");
        tracker.add(first);
        tracker.add(second);
        Item[] expected = new Item[] {first};
        assertThat(expected, is(tracker.findByName("first")));
    }


}
