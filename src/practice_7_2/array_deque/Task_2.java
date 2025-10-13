package practice_7_2.array_deque;

import java.util.ArrayDeque;

public class Task_2 {
    //Используйте ArrayDeque как стек: добавьте элементы и извлеките их в обратном порядке.

    ArrayDeque<Integer> numbers = new ArrayDeque<>();

    //Добавление нового элемента в стек Deque
    public void addNumber(Integer number) {
        numbers.push(number);
    }

    //Удаление последнего добавленного элемента в стек Deque
    public void deleteLastAddedNumber() {
        System.out.println("Удаленный элемент: " + numbers.pop());
        System.out.println();
    }

    //Метод вывода всего Deque
    public void printDeque() {
        System.out.println("Печать всех элементов ArrayDeque");
        for (Integer i : numbers) {
            System.out.println(i);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Task_2 task2 = new Task_2();

        task2.addNumber(1);
        task2.addNumber(2);
        task2.addNumber(3);
        task2.addNumber(4);
        task2.addNumber(5);
        task2.addNumber(6);

        task2.printDeque();

        task2.deleteLastAddedNumber();
        task2.deleteLastAddedNumber();

        task2.printDeque();
    }
}
