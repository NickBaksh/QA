package practice_7_2.hash_set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Task_1 {
    //Создайте HashSet из 5 чисел и выведите его содержимое.

    //Создали HashSet и инициализировали его с числами 1..5
    HashSet<Integer> numbers = new HashSet<>(List.of(1, 2, 3, 4, 5, 5, 2));

    //Метод выводит в консоль все элементы HashSet поэлементно
    public void printNumbers() {
        System.out.println("HashSet состоит из чисел:");
        for (Integer s : numbers) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Task_1 task1 = new Task_1();

        task1.printNumbers();
    }
}
