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

    /**
     * тест мотод для замены заявки
     */
    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        Item bugWithDesc = new Item("Bug with description");
        tracker.replace(id, bugWithDesc);
        assertThat(tracker.findById(id).getName(), is("Bug with description"));
    }
}
