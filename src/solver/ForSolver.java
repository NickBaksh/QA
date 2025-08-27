package solver;

import java.util.Scanner;

public class ForSolver {
    public static void main(String[] args) {
        //divideBy3();
        //sumToN();
        //multiplyTable();
        //simpleDigit();
        from1To10();
    }

    public static void divideBy3() {
        // Метод выводит все числа, которые делятся на 3 (в диапазоне от 1 до 100)

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void sumToN() {
        // Метод вычисляет сумму чисел от 1 до N

        int n;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public static void multiplyTable() {
        // Метод распечатывает таблицу умножения для введеного числа

        int n;
        int res = 1;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            res = n * i;
            System.out.println(n + " x " + i + " = " + res);
        }
    }

    public static boolean simpleDigit() {
        //Метод проверяет простое ли число

        int n;
        boolean isPrime = true;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        for (int i = 2; i <= n-1; i++) {
            if (n % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("Число - простое");
        } else System.out.println("Число не является простым");
        return isPrime;
    }

    public static void from1To10() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
