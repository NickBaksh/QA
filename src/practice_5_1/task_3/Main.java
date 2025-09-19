package practice_5_1.task_3;

public class Main {
    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant();
        MainCourse plov = new MainCourse(50);
        Drink juice = new Drink(0.4);

        restaurant.addDish(juice);
        restaurant.showMenu();
    }
}
