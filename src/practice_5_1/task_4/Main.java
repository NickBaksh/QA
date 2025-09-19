package practice_5_1.task_4;

public class Main {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        Shark shark = new Shark();
        Starfish starfish = new Starfish();

        aquarium.addSeaCreature(starfish);
        aquarium.showBehaviour();
    }
}
