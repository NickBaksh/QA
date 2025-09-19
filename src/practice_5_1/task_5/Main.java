package practice_5_1.task_5;

public class Main {
    public static void main(String[] args) {
        Farm farm = new Farm();
        Cow cow = new Cow();
        Chicken chicken = new Chicken();

        farm.addAnimal(chicken);
        farm.forceAnimalToProduce();
        farm.eatGrain();
        farm.graze();
    }
}
