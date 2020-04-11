package ru.job4j.tracker;

public class FindNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Find items by name ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        Item[] allNameFind = tracker.findByName(name);
        for (int index = 0; index < allNameFind.length; index++) {
            System.out.println(allNameFind[index]);
        }
        return true;
    }
}