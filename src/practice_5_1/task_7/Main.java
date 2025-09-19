package practice_5_1.task_7;

public class Main {
    public static void main(String[] args) {
        Park park = new Park();
        Carousel carousel = new Carousel();
        Slide slide = new Slide();

        park.addAttraction(carousel);
        park.showInfo();
    }
}
