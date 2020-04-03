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
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описания. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
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
        for (int index = 0; index < this.items.length; index++) {
            if (this.items[index].getName().equals(key)) {
                result[index] = this.items[index];
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
        Item result = null;
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i].getId().equals(id)) {
                result = this.items[i];
                break;
            }
        }
        return result;
    }

}
