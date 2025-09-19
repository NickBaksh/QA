package practice_5_1.task_2;

public class Master {
    private Pet pet;

    public void addPet(Pet pet) {
        this.pet = pet;
    }

    public void feedPet() {
        this.pet.eat();
    }

    public void forcePetToPlay() {
        if (this.pet instanceof Playable) {
            Playable playablePet = (Playable) this.pet;
            playablePet.play();
        } else {
            System.out.println("Ошибка! Это животное не играет");
        }
    }

    public void forcePetToWalk() {
        if (this.pet instanceof Walkable) {
            Walkable walkablePet = (Walkable) this.pet;
            walkablePet.walk();
        } else {
            System.out.println("Ошибка! Это животное не гуляет");
        }
    }
}
