package practice_9_1.functional_interface_and_lambdas;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        //Задача 1. Напишите интерфейс MathOperation, который принимает два числа и возвращает результат операции.
        // Реализуйте его с помощью лямбда-выражений: сложение, вычитание, умножение, деление.
        MathOperation sum = (a, b) -> a + b;
        MathOperation difference = (a, b) -> a - b;
        MathOperation multiply = (a, b) -> a * b;

        //Добавил проверку на деление на 0
        MathOperation divide = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Ошибка при делении на 0");
            } return a / b;
        };

        System.out.println(sum.operate(2, 5));
        System.out.println(difference.operate(2, 5));
        System.out.println(multiply.operate(2, 5));
        System.out.println(divide.operate(4, 2));


        //Задача 2. Использование анонимного класса. Создайте анонимный класс, реализующий интерфейс Runnable,
        // который выводит сообщение "Hello from anonymous class!".
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class!");
            }
        });

        thread.start();

        //Задача 3. Лямбда-выражение с Predicate.
        // Напишите лямбду, которая проверяет, является ли число чётным.
        Predicate<Integer> checker = a -> a % 2 ==0;

        //Число, которое будет проверяться
        int a = 4;

        if (checker.test(a)) {
            System.out.println("Число чётное!");
        } else System.out.println("Число нечётное!");

        //Задача 4. Лямбда-выражение с Function.
        // Создайте лямбду, которая принимает строку и возвращает её длину.
        Function<String, Integer> getLength = (t) -> t.length();

        //Возвращаем в консоль длину строки "t"
        System.out.println(getLength.apply("123456"));

        //Задача 5. Использование Consumer.
        // Напишите лямбду, которая принимает строку и печатает её в консоль.
        Consumer<String> printString = (s) -> System.out.println(s);
        printString.accept("Печатаем эту строку!");
    }
}
