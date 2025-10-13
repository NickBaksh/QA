package practice_7_2.linked_hash_set;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class Task_1 {
    //Создайте LinkedHashSet и добавьте в него 5 строк. Проверьте порядок элементов при выводе.

    //Создали LinkedHashSet и инициализировали его
    LinkedHashSet<String> listOfNumbers = new LinkedHashSet<>(List.of("1", "2", "2", "3", "4"));

    //Метод вывода всех элементов LinkedHashSet в консоль
    public void printList() {
        System.out.println("LinkedHashSet состоит из элементов:");
        for (String s : listOfNumbers) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Task_1 task1 = new Task_1();

        task1.printList();
    }
}
