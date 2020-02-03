package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        int indexWord = word.length - post.length;
        for(int i = 0; i < post.length; i++) {
            if (word[indexWord + i] != post[i]){
                return false;
            }
        }
        return true;
    }
}
