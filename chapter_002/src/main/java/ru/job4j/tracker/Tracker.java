package ru.job4j.tracker;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tracker {
    /**
     * Масив для хранения заявок
     */
    private List<Item> items = new ArrayList<>();

    /**
     * Метод добавления заявки в хранилище
     * @param item ноовая заявка
     */
    public Item add(Item item) {
        item.setId(generateId());
        items.add(item);
        return item;
    }

    /**
     *Замена заявки
     */
    public boolean replace(String id, Item item) {
        boolean rsl = false;
        int index = indexOf(id);
        if (index != -1) {
            item.setId(id);
            items.set(index, item);
            rsl = true;
        }
        return rsl;
    }

    /**
     *удаение заявки из массива items
     */
    public boolean delete(String id) {
        boolean rsl = false;
        int index = indexOf(id);
        if (index != -1) {
            items.remove(index);
            rsl = true;
        }
        return rsl;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описания. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    /**
     * @return index по id
     */
    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    /**
     * Получение списка всех заявок.
     * @return возвращает копию массива items без null элементов.
     */
    public List<Item> findAll() {
        return items;
    }

    /**
     * получение списка по имени
     * @return возвращает копию массива items c заданныем аргументам.
     */
    public List<Item> findByName(String key) {
        List<Item> result = new ArrayList<>();
        for (int index = 0; index < items.size(); index++) {
            if (this.items.get(index).getName().equals(key)) {
                result.add(items.get(index));
            }
        }
        return result;
    }

    /**
     * проверяет в цикле все элементы массива this.items, сравнивая id с аргументом String id
     * @return возвращает найденный Item. Если Item не найден - возвращает null.
     */
    public Item findById(String id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

}
