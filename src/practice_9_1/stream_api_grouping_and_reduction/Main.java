package practice_9_1.stream_api_grouping_and_reduction;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //Задача 1. Группировка строк по первой букве. Напишите программу, которая принимает
        // список строк и группирует их по первой букве, используя Stream API.

        List<String> listOfStrings = Arrays.asList("Adasda", "Daaa", "Cd11", "Bfsd");
        Map<Character, List<String>> grouped = listOfStrings.stream()
                .collect(Collectors.groupingBy(n -> n.charAt(0)));

        System.out.println(grouped);


        //Задача 2. Группировка чисел по чётности. Напишите программу, которая принимает список чисел
        // и группирует их на чётные и нечётные, используя Stream API.
        List<Integer> listOfIntegers = Arrays.asList(1, 2, 3, 4);
        Map<Boolean, List<Integer>> isEven = listOfIntegers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        //Выводим отдельно четные и нечетные числа
        System.out.println("Четные числа: " + isEven.get(true));
        System.out.println("Нечётные числа: " + isEven.get(false));

        //Задача 3. Поиск среднего значения чисел. Напишите программу, которая принимает список чисел
        // и находит их среднее значение, используя Stream API.

        //Использую список чисел из задачи 2
        //Преобразуем список в int и находим среднее значение через average()
        OptionalDouble getMediumValue = listOfIntegers.stream()
                .mapToInt(s -> s)
                .average();

        System.out.println(getMediumValue.getAsDouble());
    }
}
