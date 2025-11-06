package practice_10_2.synchronized_example;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();

        //Поток t1 1000 раз вызывает метод counter.increment()
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        //Поток t2 1000 раз вызывает метод counter.increment()
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        //Запускаем оба потока
        t1.start();
        t2.start();

        //Дожидаемся завершения потоков
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //Печатаем в консоль результат. Без synchronized в методе counter.increment()
        // получалось бы случайное значение count
        System.out.println("Итоговое значение count: " + counter.getCount());
    }
}
