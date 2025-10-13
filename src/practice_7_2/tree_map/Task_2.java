package practice_7_2.tree_map;

import java.util.TreeMap;

public class Task_2 {
    //Найдите минимальный и максимальный ключ в TreeMap

    //Создаем TreeMap и инициализируем его
    TreeMap<String, Integer> students = new TreeMap<>();

    //Метод добавление нового студента
    public void addStudent(String name, Integer score) {
        students.put(name, score);
    }

    //Метод поиска минимального и максимального ключа
    public void findMinAndMaxKey() {
        System.out.println("Минимальный ключ: " + students.firstKey() + " || Максимальный ключ: " + students.lastKey());
    }

    public static void main(String[] args) {
        Task_2 task2 = new Task_2();

        task2.addStudent("Никита", 174);
        task2.addStudent("Петр", 218);
        task2.addStudent("Алексей", 109);

        task2.findMinAndMaxKey();
    }
}
