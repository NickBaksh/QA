package practice_7_2.linked_list;

import java.util.LinkedList;

public class Task_1 {
    //Создайте LinkedList и добавьте в него 5 строк. Выведите все элементы списка.

    //создали новый LinkedList
    LinkedList<String> letter = new LinkedList<>();

    //метод добавления новой строки в список
    public void addString(String newString) {
        letter.addLast(newString);
    }

    //Метод вывода всего списка в консоль
    public void printLetter() {
        System.out.println("Список:");
        for (String str : letter) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        Task_1 task1 = new Task_1();

        task1.addString("Строка1");
        task1.addString("Строка2");
        task1.addString("Строка3");
        task1.addString("Строка4");
        task1.addString("Строка5");

        task1.printLetter();
    }
}
