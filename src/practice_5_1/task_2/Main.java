package practice_5_1.task_2;

public class Main {
    public static void main(String[] args) {
        Dogs petya = new Dogs();
        Cat boba = new Cat();

        Master ivan = new Master();
        ivan.addPet(boba);
        ivan.feedPet();
        ivan.forcePetToPlay();
        ivan.forcePetToWalk();
    }
}
