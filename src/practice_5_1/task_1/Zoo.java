package practice_5_1.task_1;

public class Zoo {
    private Animal animal;

    public void addAnimal(Animal animal) {
        this.animal = animal;
        System.out.println("Лог: в зоопарк добавлено животное " + animal);
    }

    public void forceAnimalMakeSound() {
        this.animal.makeSound();
        System.out.println("Лог: животное издало звук");
    }

    public void forceAnimalMove() {
        this.animal.move();
        System.out.println("Лог: животное двигается");
    }
}
