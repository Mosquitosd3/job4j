
package ru.job4j.tracker;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
 /*
public class StartUITest {

    @Test
    public void whenExit() {
        StubInput input = new StubInput(new String[]{"0"});
        StubAction action = new StubAction();
        new StartUI().init(input, new Tracker(), new UserAction[] {action});
        assertThat(action.isCall(), is(true));
    }



    @Test
    public void whenAddItem() {
        List<String> answer = List.of("Fix PC");
        Input input = new StubInput(answer);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item create = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(create.getName(), is(expected.getName()));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answer = {item.getId(), "replaced item"};
        StartUI.replaceItem(new StubInput(answer), tracker);
        Item replace = tracker.findById(item.getId());
        assertThat(replace.getName(), is("replaced item"));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("New Item");
        tracker.add(item);
        String[] answer = {item.getId()};
        StartUI.deleteItem(new StubInput(answer), tracker);
        Item delete = tracker.findById(item.getId());
        assertNull(delete);
    }

}

 */
