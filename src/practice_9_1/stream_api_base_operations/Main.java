package practice_9_1.stream_api_base_operations;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //Задача 1. Фильтрация строк по длине больше 5.
        // Напишите программу, которая принимает список строк и удаляет из него
        // все строки длиной 5 символов и менее, используя Stream API.

        //Создаем коллекцию со списком строк
        List<String> strings = Arrays.asList("12", "fsdf", "43к4к", "rewe", "123456");

        //С помощью filter() убираем строки длиной 5 и менее символов
        List<String> newListOfStrings = strings.stream()
                .filter(a -> a.length() > 5)
                .toList();

        System.out.println(newListOfStrings);

        //Задача 2. Фильтрация чисел, кратных 5. Напишите программу, которая принимает список чисел
        // и отбирает только те, которые делятся на 5 без остатка, используя Stream API.
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> newIntegers = integers.stream()
                .filter(a -> a % 5 == 0)
                .toList();

        System.out.println(newIntegers);

        //Задача 3. Преобразование строк в их длины. Напишите программу, которая принимает список строк
        // и заменяет каждую строку на её длину, используя Stream API.

        //Использую коллекцию со списком строк из задачи 1
        List<Integer> getLength = strings.stream()
                .map(a -> a.length())
                .toList();

        //Печатаем в консоль список длин строк из списка "listOfStrings"
        System.out.println(getLength);

        //Задача 4. Создание списка квадратов чисел. Напишите программу, которая принимает список чисел
        // и преобразует его в новый список, где каждое число заменено на его квадрат, используя Stream API.

        //Использую коллекцию со списком чисел из задачи 2
        List<Integer> getSquaredListOfIntegers = integers.stream()
                .map(s -> s * s)
                .toList();

        //Выводим в консоль список квадратов чисел "listOfIntegers"
        System.out.println(getSquaredListOfIntegers);

        //Задача 5. Удаление дубликатов из списка. Напишите программу, которая
        // принимает список элементов и удаляет из него все дубликаты, используя Stream API.

        List<Integer> numbers = Arrays.asList(1, 2, 2, 2, 4, 5, 6, 7, 7, 8);

        //stream удаляет дубликаты с помощью метода distinct()
        List<Integer> deleteDuplicates = numbers.stream()
                .distinct()
                .toList();

        System.out.println(deleteDuplicates);
    }
}
