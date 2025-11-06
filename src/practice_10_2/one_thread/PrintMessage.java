package practice_10_2.one_thread;

public class PrintMessage implements Runnable {

    //Переопределяем метод run() и печатаем текст 5 раз с паузой в 1 секунду
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Привет из потока!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
