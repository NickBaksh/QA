package solver;

import java.util.Scanner;

public class SwitchSolver {
    public static void main(String[] args) {
        //dayOfWeek();
        //ticketPrice();
        //numberToLetter();
        //textCommand();
        calc();
    }

    public static void dayOfWeek() {
        //Метод выводит значение дня недели по номеру

        int day;
        Scanner scanner = new Scanner(System.in);
        day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default: System.out.println("Введеное некорректное значение");

        }
    }

    public static void ticketPrice() {
        //Метод выводит стоимость билета в зависимости от дня недели

        int day;
        Scanner scanner = new Scanner(System.in);
        day = scanner.nextInt();

        if (day > 0 && day <= 5) {
            System.out.println("Стоимость билета в будни == 300 рублей");
        }
        else if (day >= 6 && day <= 7) {
            System.out.println("Стоимость билета в выходные == 450 рублей");
        }
        else System.out.println("Введено некорректное значение в day");
    }

    public static void numberToLetter() {
        // Метод выводит буквенную оценку в зависимости от введенной числовой оценки (0-100)

        int mark;
        Scanner scanner = new Scanner(System.in);
        mark = scanner.nextInt();

        if (mark >= 90 && mark <= 100) {
            System.out.println("A");
        } else if (mark >= 80 && mark <= 89) {
            System.out.println("B");
        } else if (mark >= 70 && mark <= 79) {
            System.out.println("C");
        } else if (mark >= 60 && mark <= 69) {
            System.out.println("D");
        } else if (mark < 60) {
            System.out.println("F");
        } else System.out.println("Введена некорректная оценка");
    }

    public static void textCommand() {
        // Метод для вывода результата по названию команды

        String command;
        Scanner scanner = new Scanner(System.in);
        command = scanner.nextLine();

        switch (command) {
            case "start":
                System.out.println("Запуск системы");
                break;
            case "stop":
                System.out.println("Система остановлена");
                break;
            case "restart":
                System.out.println("Система перезапущена");
                break;
            case "status":
                System.out.println("Система запущена");
                break;
            default: System.out.println("Неизвестная команда");
        }
    }

    public static void calc() {

        int a;
        int b;
        String operator;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        Scanner newscanner = new Scanner(System.in);
        operator = newscanner.nextLine();

        switch (operator) {
            case "+":
                int sum = a + b;
                System.out.println("Сумма чисел a и b = " + sum);
                break;
            case "-":
                int dif = a - b;
                System.out.println("Разность чисел a и b = " + dif);
                break;
            case "*":
                int mult = a * b;
                System.out.println("Произведение чисел a и b = " + mult);
                break;
            case "/":
                if (b != 0) {
                    int div = a / b;
                    System.out.println("Результат деления числа a на b = " + div);
                    break;
                }
                default: System.out.println("Введен некорректный оператор");
        }
    }
}
