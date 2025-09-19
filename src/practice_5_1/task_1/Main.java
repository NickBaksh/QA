package practice_5_1.task_1;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Elephant elephant = new Elephant();

        Zoo zoo = new Zoo();
        zoo.addAnimal(elephant);
        zoo.forceAnimalMakeSound();
        zoo.forceAnimalMove();
    }
}
