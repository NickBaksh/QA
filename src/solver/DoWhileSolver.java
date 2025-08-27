package solver;

import java.util.Scanner;

public class DoWhileSolver {
    public static void main(String[] args) {
        //plusNumber();\
        //checkPassword();
        //from1To10();
        //exit();
        calculateNumber();
    }

    public static void plusNumber() {
        int number;
        do {
            System.out.println("Введите положительное число ");
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextInt();
        } while (number <= 0);
        System.out.println("Спасибо!");
    }

    public static void checkPassword() {
        //Метод проверяет соответствие введенного пользователем пароля с паролем в системе

        String password = "qwerty";
        String userPassword;
        do {
            System.out.println("Введите пароль ");
            Scanner scanner = new Scanner(System.in);
            userPassword = scanner.nextLine();
        } while (!userPassword.equals(password));
        System.out.println("Спасибо!");
    }

    public static void from1To10() {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

    public static void exit() {
        //Метод выполняет программу до ввода пользователем exit

        String key = "exit";
        String userCommand;
        do {
            System.out.println("Введите команду ");
            Scanner scanner = new Scanner(System.in);
            userCommand = scanner.nextLine();
        } while (!userCommand.equals(key));
        System.out.println("Программа завершена!");
    }

    public static void calculateNumber() {
        int count = 0;
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        do {
            n = n / 10;
            count++;
        } while (n > 0);
        System.out.println(count);
    }
}
