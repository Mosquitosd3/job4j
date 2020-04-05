package ru.job4j.tracker;

import java.util.Random;
import java.util.Arrays;

public class Tracker {
    /**
     * Масив для хранения заявок
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячйки для новой заявки
     */
    private int position = 0;

    /**
     * Метод добавления заявки в хранилище
     * @param item ноовая заявка
     */
    public Item add(Item item) {
        item.setId(generateId());
        items[position++] = item;
        return item;
    }

    /**
     *Замена заявки
     */
    public void replace(String id, Item item) {
        int index = indexOf(id);
        item.setId(id);
        this.items[index] = item;
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
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
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
    public Item[] findAll() {
        return Arrays.copyOf(this.items, this.position);
    }

    /**
     * получение списка по имени
     * @return возвращает копию массива items c заданныем аргументам.
     */
    public Item[] findByName(String key) {
        Item[] result = new Item[position];
        int size = 0;
        for (int index = 0; index < this.position; index++) {
            if (this.items[index].getName().equals(key)) {
                result[size] = this.items[index];
                size++;
            }
        }
        return Arrays.copyOf(result, size);
    }

    /**
     * проверяет в цикле все элементы массива this.items, сравнивая id с аргументом String id
     * @return возвращает найденный Item. Если Item не найден - возвращает null.
     */
    public Item findById(String id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

}
