package practice_10_2.synchronized_example;

public class Counter {
    //счетчик count
    private int count = 0;

    //Создаем synchronized метод increment(),
    // который увеличивает значение count на 1
    public synchronized void increment() {
        count++;
    }

    //Метод, который возвращает значение count
    public int getCount() {
        return this.count;
    }
}
