package ru.job4j.tracker;

import java.util.List;

public class FindNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Find items by name ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        List<Item> allNameFind = tracker.findByName(name);
        for (int index = 0; index < allNameFind.size(); index++) {
            System.out.println(allNameFind.get(index));
        }
        return true;
    }
}
