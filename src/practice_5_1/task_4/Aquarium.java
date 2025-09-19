package practice_5_1.task_4;

public class Aquarium {
    SeaCreature seaCreature;

    public void addSeaCreature(SeaCreature seaCreature) {
        this.seaCreature = seaCreature;
    }

    public void showBehaviour() {
        this.seaCreature.move();
    }
}
