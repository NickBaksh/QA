package practice_5_1.task_5;

public class Chicken extends Animal implements Grainable {

    @Override
    public void produce() {
        System.out.println("Курица несёт яйца");
    }

    @Override
    public void eatGrain() {
        System.out.println("Курица требует зерно");
    }
}
