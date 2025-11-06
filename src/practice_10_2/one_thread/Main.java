package practice_10_2.one_thread;

public class Main {
    public static void main(String[] args) {
        PrintMessage messagePrinter = new PrintMessage();

        //Создаем новый поток и передаем в аргумент экземпляр класса PrintMessage,
        // который будет вызывать метод run()
        Thread t1 = new Thread(messagePrinter);
        t1.start();
    }
}
