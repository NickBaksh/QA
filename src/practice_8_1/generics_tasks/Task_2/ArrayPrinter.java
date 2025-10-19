package practice_8_1.generics_tasks.Task_2;

public class ArrayPrinter {
    //Напишите дженерик метод printArray, который принимает массив элементов любого типа и выводит каждый элемент
    // массива на консоль.


    //Дженерик метод для печати массивов, принимает массив с любым типом данных. Выводит в консоль каждый элемент
    public static <T> void printArray(T[] array) {
        for (T e : array) {
            System.out.println(e);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //создаем массивы с разными типами данных
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"213", "fsd12"};
        Double[] doubleArray = {12.4, 55.4, 211.2};

        //печатаем каждый из массивов с помощью метода printArray()
        printArray(intArray);
        printArray(strArray);
        printArray(doubleArray);
    }
}
