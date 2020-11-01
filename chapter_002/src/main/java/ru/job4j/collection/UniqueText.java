package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> chek = new HashSet<>();
        for (String el : origin) {
            chek.add(el);
        }

        for (String el: text) {
            if(!chek.contains(el)) {
                rsl = false;
            }

        }
        return rsl;
    }
}
