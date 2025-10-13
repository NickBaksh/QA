package practice_7_2.linked_hash_map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task_2 {
    //Реализуйте телефонную книгу с LinkedHashMap. Добавьте и найдите контакт.

    //Создали LinkedHashMap и инициализировали
    Map<String, Long> phoneBook = new LinkedHashMap<>();

    //Метод добавления нового контакта в телефонную книгу
    public void addContact(String name, Long number) {
        phoneBook.put(name, number);
    }

    //Метод поиска контакта по имени человека
    public void findContact(String contactName) {
        System.out.println("Контакт:");
        System.out.println("Имя, номер: " + contactName + " == " + phoneBook.get(contactName));
    }

    public static void main(String[] args) {
        Task_2 task2 = new Task_2();

        task2.addContact("Никита", 89991114444L);
        task2.addContact("Алекс", 79221112233L);
        task2.addContact("Петр", 89275555555L);

        task2.findContact("Петр");
    }
}
