package practice_7_2.linked_list;

import java.util.LinkedList;

public class Task_2 {
    //Реализуйте очередь задач с LinkedList. Добавьте 3 задачи и обработайте их в порядке поступления.

    LinkedList<String> tasks = new LinkedList<>();

    //Метод добавления новых задач в список
    public void addTask(String newTask) {
        tasks.addLast(newTask);
    }

    //Метод обработки задач в очереди
    public void getTask() {
        tasks.poll();
    }

    //Метод вывода в консоль всех задач
    public void printTasks() {
        System.out.println("Список задач:");
        for (String s : tasks) {
            System.out.println(s);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Task_2 task2 = new Task_2();

        task2.addTask("Встать с кровати");
        task2.addTask("Умыться");
        task2.addTask("Одеться");

        task2.printTasks();

        task2.getTask();

        task2.printTasks();

        task2.getTask();
        task2.getTask();

        task2.printTasks();


    }
}
