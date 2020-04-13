package ru.job4j.ex;

public class ElementNotFoundException extends Exception {

    public ElementNotFoundException(String message) {
        super(message);
    }

    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rls = -1;
        int index = 0;
        for (String str: value) {
            if (str.equals(key)) {
                rls = index;
                break;
            }
            index++;
        }
        if (rls == -1) {
            throw new ElementNotFoundException("Element not found");
        }
        return rls;
    }

    public static void main(String[] args) {
        String[] str = {"kolya", "diana", "masha"};
        try {
            indexOf(str, "ivan");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }

}
