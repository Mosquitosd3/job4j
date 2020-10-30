package ru.job4j.tracker;

import java.util.List;

public class ShowAllAction implements UserAction {
    @Override
    public String name() {
        return "=== All Items ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        List<Item> item = tracker.findAll();
        for (int index = 0; index < item.size(); index++) {
            System.out.println(item.get(index));
        }
        return true;
    }
}
