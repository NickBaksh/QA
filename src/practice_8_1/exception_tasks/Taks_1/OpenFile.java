package practice_8_1.exception_tasks.Taks_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class OpenFile {
    //Напишите программу, которая пытается открыть файл с именем "data.txt".
    // Если файл не найден, программа должна обработать исключение и вывести сообщение: "Файл не найден".


    //Метод открывает переданный файл, читает первую строку и выводит в консоль,
    // после чего закрывает файл. Если файл не найден, то срабатывает исключение IOException
    public static void openTextFile(String fileName) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String line = bufferedReader.readLine();
        System.out.println(line);
        bufferedReader.close();
    }

    public static void main(String[] args) {

        //Пробуем вызвать метод openTextFile(),
        // при отсутствии файла в системе -- обрабатывается исключение IOException
        try {
            openTextFile("data.txt");
        } catch (IOException e) {
            System.out.println("Файл не найден"); //по условию задачи должны вывести текст "Файл не найден",
            // но также можно вывести тест ошибки через System.out.println("Файл не найден: " + e.getMessage());
        }
    }
}
