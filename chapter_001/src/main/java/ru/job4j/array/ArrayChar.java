package ru.job4j.array;

public class ArrayChar {
    public static boolean startWith(char[] word, char[] pref){
        int count = 0;
        for (int index = 0; index < pref.length; index++) {
            if(pref[index] == word[index]) {
                count++;
            }
        }
        if (count == pref.length) {
            return true;
        }
        return false;
    }

}
