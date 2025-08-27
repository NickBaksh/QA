package solver;

import java.util.Scanner;

public class IfElseSolver {
    public static void main(String[] args) {
       // guessDigitSign();
        // maxNumber();
        //mark();
        //checkEven();
        //saleByAge();
        markByScore();
    }

    public static void guessDigitSign() {
        //Метод, который определяет знак числа

        Scanner scanner = new Scanner(System.in);
        int digit;
        digit = scanner.nextInt();
        if (digit > 0) {
            System.out.println("Число положительное");
        }
        else if (digit < 0) {
            System.out.println("Число отрицательное");
        }
        else System.out.println("Число равно нулю");
    }

    public static void maxNumber() {
        // Метод, который выводит наибольшее из двух чисел

        int a;
        int b;
        int res = 0;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        if (a > b) {
            res = a;
        }
        else res = b;
        System.out.println("Наибольшее число: " + res);
    }

    public static void mark() {
        // Метод выводит описание для введенной оценки (1-5)

        int mark;
        Scanner scanner = new Scanner(System.in);
        mark = scanner.nextInt();
        switch (mark) {
            case 1:
                System.out.println("Неудовлетворительно");
                break;
            case 2:
                System.out.println("Неудовлетворительно");
                break;
            case 3:
                System.out.println("Удовлетворительно");
                break;
            case 4:
                System.out.println("Хорошо");
                break;
            case 5:
                System.out.println("Отлично");
                break;
            default: System.out.println("Введена некорректная оценка, допустимый диапозон: 1-5");
        }
    }

    public static void checkEven() {
        // Метод проверяет число на четность

        int digit;
        Scanner scanner = new Scanner(System.in);
        digit = scanner.nextInt();
        if (digit % 2 == 0) {
            System.out.println("Чётное");
        }
        else System.out.println("Нечётное");
    }

    public static void saleByAge() {
        //Метод выводит размер скидки в зависимости от возраста

        int age;
        Scanner scanner = new Scanner(System.in);
        age = scanner.nextInt();

        if (age < 18 && age > 0) {
            System.out.println("Ваша скидка -- 25%");
        }
        else if (age >= 65) {
            System.out.println("Ваша скидка -- 30%");
        }
        else System.out.println("Вам не положена скидка!");
    }

    public static void markByScore() {
        //Метод выводит результат теста в зависимости от баллов

        int score;
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();
        if (score >= 90) {
            System.out.println("Отлично");
        } else if (score >= 75 && score <= 89) {
            System.out.println("Хорошо");
        } else if (score >= 60 && score <= 74) {
            System.out.println("Удовлетворительно");
        } else System.out.println("Неудовлетворительно");
    }
}
