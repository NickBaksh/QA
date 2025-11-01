package practice_9_1.stream_api_agregate_operations;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //Задача 1. Поиск максимального элемента. Напишите программу, которая принимает
        // список чисел и находит в нём самое большое число, используя Stream API.
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6);

        //Возвращаем самое большое число в ListOfIntegers. Находим с помощью метода max()
        OptionalInt getMaxValue = integers.stream()
                .mapToInt(s -> s)
                .max();

        if (getMaxValue.isPresent()) {
            System.out.println("Максимальное число: " + getMaxValue.getAsInt());
        }
        else System.out.println("В списке отсутствуют числа!");

        //Задача 2. Поиск минимального элемента. Напишите программу, которая принимает
        // список чисел и находит в нем наименьшее число, используя Stream API.

        //Использую список чисел из задачи 1
        OptionalInt getMinValue = integers.stream()
                .mapToInt(s -> s)
                .min();

        if (getMinValue.isPresent()) {
            System.out.println("Минимальное число в списке: " + getMinValue.getAsInt());
        } else System.out.println("В списке отсутствуют числа!");

        //Задача 3. Сумма всех элементов списка. Напишите программу, которая принимает
        // список чисел и вычисляет их сумму, используя Stream API.

        //Использую список чисел из задачи 1. Преобразую список в int. Через метод sum() вычисляю сумму чисел
        OptionalLong getSumOfValues = OptionalLong.of(integers.stream()
                .mapToInt(s -> s)
                .sum());

        System.out.println(getSumOfValues.getAsLong());

        //Задача 4. Поиск первого элемента, начинающегося на "Б". Напишите программу, которая принимает
        // список строк и находит первую строку, начинающуюся на букву "Б", используя Stream API.

        List<String> listOfStrings = Arrays.asList("Avdf", "sdfsd", "Бавыы", "fsdsd", "Бк12");

        Optional<String> getValueByElement = listOfStrings.stream()
                .filter(s -> s.startsWith("Б"))
                .findFirst();

        System.out.println(getValueByElement.get());

        //Задача 5. Проверка наличия хотя бы одного элемента по условию. Напишите программу,
        // которая проверяет, есть ли хотя бы один элемент в списке, который удовлетворяет
        // заданному условию (например, является чётным числом), используя Stream API.

        List<Integer> numbers = Arrays.asList(1, 2, 3);
        boolean isEvenNumber = numbers.stream()
                .anyMatch(s -> s % 2 == 0);

        //В зависимости от boolean результата "numbers" печатает сообщение в консоль
        if (isEvenNumber) {
            System.out.println("В списке есть четные числа!");
        } else System.out.println("В списке отсутствуют четные числа");
    }
}
