package practice_7_2.priority_queue;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Task_1 {
    //Создайте PriorityQueue и добавьте 5 чисел. Выведите их в порядке удаления.

    //Создаем PriorityQueue и инициализируем ее
    PriorityQueue<Integer> numbers = new PriorityQueue<>();

    //Метод добавления элемента в очередь
    public void addNumber(Integer number) {
        numbers.add(number);
    }


    //Метод печати всех элементов очереди в консоль
    public void printQueue() {
        System.out.println("Список элементов очереди:");
        for (Integer i : numbers) {
            System.out.println(i);
        }
        System.out.println();
    }

    //Метод получения первого элемента в очереди и печать его в консоль
    public void getFirstNumber() {
        System.out.println(numbers.poll());
    }

    public static void main(String[] args) {
        Task_1 task1 = new Task_1();

        task1.addNumber(2);
        task1.addNumber(7);
        task1.addNumber(4);
        task1.addNumber(5);
        task1.addNumber(1);


        task1.printQueue();
        task1.getFirstNumber();
        task1.getFirstNumber();
        task1.getFirstNumber();
    }
}
