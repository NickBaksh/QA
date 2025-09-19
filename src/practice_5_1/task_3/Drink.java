package practice_5_1.task_3;

public class Drink extends Dish {

    private double volume;

    Drink (double volume) {
        this.volume = volume;
    }

    @Override
    public void showCharacteristics() {
        System.out.println("Объём напитка -- " + volume);
    }
}
