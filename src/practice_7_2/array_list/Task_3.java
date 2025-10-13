package practice_7_2.array_list;

import java.util.ArrayList;

public class Task_3 {
    //Создайте ArrayList из строк. Найдите в нём самую длинную строку и выведите её.

    //Создаем динамический массив из строк и инициализируем его
    ArrayList<String> letter = new ArrayList<>();

    //Создаем метод добавление новых строк в массив
    public void addString(String newString) {
        letter.add(newString);
    }

    //Создаем метод выводы массива в консоль
    public void printLetter() {
        System.out.println("Список строк:");
        for (String str : letter) {
            System.out.println(str);
        }
    }

    //Создаем метод вычисления самой длинной строки
    public String getLongestString() {
        int maxLen = 0;
        String result = "";
        for (String s : letter) {
            if (s.length() > maxLen) {
                maxLen = s.length();
                result = s;
            }
        } return result;
    }

    public static void main(String[] args) {
        Task_3 task3 = new Task_3();

        task3.addString("aaa");
        task3.addString("aaaaa");
        task3.addString("dsfsdfsdfdsfdsfdsfds");
        task3.addString("aaaaaa");
        task3.addString("aaaaaaaa");

        task3.printLetter();

        System.out.println();
        System.out.println(task3.getLongestString());
    }



}
