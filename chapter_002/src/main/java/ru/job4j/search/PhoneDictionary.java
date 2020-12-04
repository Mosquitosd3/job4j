package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> name = s -> s.getName().contains(key) ;
        Predicate<Person> surName = s -> s.getSurname().contains(key);
        Predicate<Person> phone = s -> s.getPhone().contains(key);
        Predicate<Person> address = s -> s.getAddress().contains(key);
        ArrayList<Person> result = new ArrayList<>();
        for (var person : persons) {
            if (name.or(surName.or(phone.or(address))).test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
