package practice_10_2.two_thread;

import practice_10_2.one_thread.PrintMessage;

public class ThreadAb {
    public static void main(String[] args) {

        //Создаем поток, который 5 раз печатает в консоль "A" с паузой 100мс
        Thread printerA = new Thread(() -> {
           for (int i = 0; i < 5; i++) {
               System.out.println("A");
               try {
                   Thread.sleep(100);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
        });

        //Создаем поток, который 5 раз печатает в консоль "B" с паузой 100мс
        Thread printerB = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("B");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        //запускаем оба потока
        printerA.start();
        printerB.start();

        //ждем окончания выполнения потоков, обрабатываем исключение
        try {
            printerA.join();
            printerB.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
