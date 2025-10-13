package practice_7_2.array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class Task_1 {
    //Создайте ArrayList из 5 чисел. Добавьте ещё одно число в конец. Выведите весь список.


    //Создаем динамический массив
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

    //создаем метод добавления нового числа в массив
    public void addNumber(int someNumber) {
        numbers.add(someNumber);
    }

    //создаем метод вывода массива в консоль
    public void printNumbers() {
        System.out.println("Массив чисел:");
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }


    public static void main(String[] args) {
        Task_1 task1 = new Task_1();

        task1.printNumbers();

        System.out.println();
        task1.addNumber(10);

        System.out.println();
        task1.printNumbers();
    }
}
