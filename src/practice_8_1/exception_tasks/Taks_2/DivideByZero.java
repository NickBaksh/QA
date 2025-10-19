package practice_8_1.exception_tasks.Taks_2;

import java.util.InputMismatchException;

public class DivideByZero {
    //Условие задачи: Напишите метод, который принимает на вход два числа и выполняет их деление.
    // Обработайте ситуацию, когда второе число равно нулю, чтобы избежать исключения при делении.

    //метод для деления двух целых чисел
    public static void divide(int a, int b) {
        System.out.println(a / b);
    }

    public static void main(String[] args) {

        //Обрабатываем исключение ArithmeticException в случае если второе число == 0
        try {
            divide(1, 0);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage()); //почему-то исключение вместо привычного формата
            // вернуло текст "/ by zero"
        }
    }
}
