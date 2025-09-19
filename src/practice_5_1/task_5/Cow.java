package practice_5_1.task_5;

public class Cow extends Animal implements Grazingable{

    @Override
    public void produce() {
        System.out.println("Корова даёт молоко");
    }

    @Override
    public void graze() {
        System.out.println("Корова нуждается в выпасе");
    }
}
