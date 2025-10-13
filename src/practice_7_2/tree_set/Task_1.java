package practice_7_2.tree_set;

import java.util.TreeSet;

public class Task_1 {
    //Создайте TreeSet из 5 чисел и выведите его. Обратите внимание на порядок.

    //Создаем новый TreeSet и инициализируем его
    TreeSet<Integer> numbers = new TreeSet<>();

    //Метод добавляет новое число в TreeSet
    public void addNumber(int number) {
        numbers.add(number);
    }

    //Метод выводит все элементы TreeSet в консоль
    public void printSet() {
        System.out.println("TreeSet содержит элементы:");
        for (int s : numbers) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Task_1 task1 = new Task_1();

        task1.addNumber(1);
        task1.addNumber(5);
        task1.addNumber(2);
        task1.addNumber(9);
        task1.addNumber(1);

        task1.printSet();

    }
}
