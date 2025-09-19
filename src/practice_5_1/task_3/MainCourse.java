package practice_5_1.task_3;

public class MainCourse extends Dish {

    private int temperature;

    MainCourse (int temperature) {
        this.temperature = temperature;
    }

    @Override
    public void showCharacteristics() {
        System.out.println("Температура горячего блюда " + temperature + " градусов");
    }
}
