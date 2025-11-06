package practice_10_2.volatile_example;

public class Main {
    private static int count = 0;

    //решаем проблему видимости с помощью volatile
    private static volatile boolean stop = false;

    public static void main(String[] args) throws InterruptedException {

        //Создаем поток, который добавляет инкремент пока stop = false
        Thread t1 = new Thread(() -> {
           while (!stop) {
               count++;
           }
           System.out.println("Счетчик остановлен. Итоговое значение count: " + count);
        });

        //запускаем поток
        t1.start();

        //Добавляем паузу в 2 сек
        Thread.sleep(2000);
        stop = true;
        System.out.println("Изменили значение флага 'stop' на true");

        t1.join();
    }
}
