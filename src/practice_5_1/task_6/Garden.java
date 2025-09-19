package practice_5_1.task_6;

public class Garden {
    private Plant plant;

    public void addPlant(Plant plant) {
        this.plant = plant;
    }

    public void takeCareOfPlant() {
        this.plant.care();
    }
}
