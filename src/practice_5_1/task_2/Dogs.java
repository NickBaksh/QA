package practice_5_1.task_2;

public class Dogs extends Pet implements Walkable {

    @Override
    public void eat() {
        System.out.println("Собака ест сухой корм!");
    }

    @Override
    public void walk() {
        System.out.println("Собака гуляет");
    }
}
