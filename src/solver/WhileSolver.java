package solver;

import java.util.Scanner;

public class WhileSolver {
    public static void main(String[] args) {
        //factorial();
        //printEvenNumber();
        revertNumber();
    }

    public static void factorial() {
        //Метод считает факториал числа n

        int result = 1;
        int i = 1;

        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        while (i <= n) {
            result = result * i;
            i++;
        }
        System.out.println("Факториал числа: " + n + " равен " + result);
    }

    public static void printEvenNumber() {
        //Метод выводит все четные числа от 1 до заданного числа

        int n;
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        while (i <= n) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    public static void revertNumber() {
        // Метод распечатывает обратный отсчет от заданного числа до 1

        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        while (n >= 1) {
          System.out.println(n);
          n--;
        }
    }
}
