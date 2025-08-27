package solver;

import java.util.Scanner;

public class BreakContinueSolver {
    public static void main(String[] args) {
        //firstNegative();
        //skip3();
        //onlyPositive();
        stop();
    }

    public static void firstNegative() {
        //Метод считает сумму чисел пока пользователь не введет негативное число

        int sum = 0;
        int n;

        while (true) {
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();
            if (n < 0) {break;}
            sum = sum + n;
        }
        System.out.println(sum);
    }

    public static void skip3() {
        //Метод выводит числа от 1 до 20, кроме тех что делятся на 3

        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {continue;}
            System.out.println(i);
        }
    }

    public static void onlyPositive() {
        //Метод выводит только положительные числа, которые ввел пользователь

        int n;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();
            if (n < 0) {continue;}
            System.out.println(n);
        }
    }

    public static void stop() {
        //Метод возвращает введенную пользователем строку до тех пор, пока не будет введена команда stop

        String command;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            command = scanner.nextLine();
            if (command.equals("stop")) {break;}
            System.out.println(command);
        }
    }
}
