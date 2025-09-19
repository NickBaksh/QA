package practice_5_1.task_6;

public class Main {
    public static void main(String[] args) {
        Garden garden = new Garden();
        Orchid orchid = new Orchid();
        Cactus cactus = new Cactus();

        garden.addPlant(cactus);
        garden.takeCareOfPlant();
    }
}
