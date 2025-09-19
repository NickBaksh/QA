package practice_5_1.task_5;

public class Farm {
    private Animal animal;

    public void addAnimal(Animal animal) {
        this.animal = animal;
    }

    public void forceAnimalToProduce() {
        this.animal.produce();
    }

    public void graze() {
        System.out.println("ЛОГ. Запустили метод пастись");
        if (this.animal instanceof Grazingable) {
            Grazingable grazingAnimal = (Grazingable) this.animal;
            grazingAnimal.graze();
        } else {
            System.out.println("Ошибка. Животное не посётся");
        }
    }

    public void eatGrain() {
        System.out.println("ЛОГ. Запустили метод есть зерно");
        if (this.animal instanceof Grainable) {
            Grainable grainable = (Grainable) this.animal;
            grainable.eatGrain();
        } else {
            System.out.println("Ошибка. Это животное не питается зерном!");
        }
    }
}
