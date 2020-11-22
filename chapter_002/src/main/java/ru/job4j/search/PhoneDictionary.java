package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> name = s -> s.getName().equals(key) ;
        Predicate<Person> surName = s -> s.getSurname().equals(key);
        Predicate<Person> phone = s -> s.getPhone().equals(key);
        Predicate<Person> address = s -> s.getAddress().equals(key);
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (name.or(surName.or(phone.or(address))).test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
