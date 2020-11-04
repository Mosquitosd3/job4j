package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("mosquitod3@yandex.ru", "Николай Александрович");
        map.put("kolya.gorbunkov@gmail.com", "Николай Александрович");

        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " " + value);
        }
    }
}
