package practice_7_2.hash_map;

import java.util.HashMap;
import java.util.Map;

public class Task_3 {
    //Реализуйте метод, который печатает из HashMap всех пользователей младше 18 лет.

    //Создали новый HashMap и инициализировали его
    Map<String, Integer> persons = new HashMap<>();

    //Метод добавляет новые пары ключ-значения в HashMap
    public void addPerson(String name, Integer age) {
        persons.put(name, age);
    }

    //Метод выводит в консоль людей моложе 18 лет
    public void printYoungPersons() {
        System.out.println("Лица моложе 18 лет:");
        for (Map.Entry<String, Integer> entry : persons.entrySet()) {
            if (entry.getValue() < 18) {
                System.out.println(entry.getKey() + " == " + entry.getValue());
            }
        }
    }


    public static void main(String[] args) {
        Task_3 task3 = new Task_3();

        task3.addPerson("Никита", 17);
        task3.addPerson("Алексей", 37);
        task3.addPerson("Виктор", 12);
        task3.addPerson("Петр", 14);
        task3.addPerson("Анна", 22);
        task3.addPerson("Александра", 18);
        task3.addPerson("Петр", 24);

        task3.printYoungPersons();
    }
}
