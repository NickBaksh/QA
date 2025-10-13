package practice_7_2.hash_map;

import java.util.HashMap;
import java.util.Map;

public class Task_1 {
    //Создайте HashMap<String, Integer>, добавьте 5 пар (имя – возраст) и выведите все записи

    //Создаем HashMap и инициализируем его
    Map<String, Integer> persons = new HashMap<>();

    //Метод добавления новых людей в HashMap
    public void addPerson(String name, int age) {
        persons.put(name, age);
    }

    //Метод вывода в консоль всех людей
    public void printPersons() {
        System.out.println("Список людей:");
        for (Map.Entry<String, Integer> entry : persons.entrySet()) {
            System.out.println(entry.getKey() + " == " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Task_1 task1 = new Task_1();

        task1.addPerson("Никита", 27);
        task1.addPerson("Ася", 24);
        task1.addPerson("Петр", 47);
        task1.addPerson("Лена", 17);
        task1.addPerson("Саша", 28);
        task1.addPerson("Лена", 27);

        task1.printPersons();

    }
}
