package practice_7_2.hash_set;

import java.util.HashSet;

public class Task_2 {
    //Добавьте в HashSet 10 чисел. Проверьте, содержит ли он заданное число.

    //Создали и инициализировали HashSet
    HashSet<Integer> numbers = new HashSet<>();

    //Метод добавления нового числа в HashSet
    public void addNumber(int number) {
        numbers.add(number);
    }

    //Метод проверки наличия числа в HashSet
    public void isConsistValue(int someValue) {
        if (numbers.contains(someValue)) {
            System.out.println("Число " + someValue + " содержится в HashSet");
        } else System.out.println("Число " + someValue + " не содержится в HashSet");
    }

    public static void main(String[] args) {
        Task_2 task2 = new Task_2();

        task2.addNumber(1);
        task2.addNumber(2);
        task2.addNumber(3);
        task2.addNumber(4);
        task2.addNumber(5);
        task2.addNumber(6);
        task2.addNumber(7);
        task2.addNumber(8);
        task2.addNumber(9);
        task2.addNumber(10);

        task2.isConsistValue(10);
    }

}
