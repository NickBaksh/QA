package practice_5_1.task_3;

public class Restaurant {
    Dish dish;

    public void addDish(Dish dish) {
        this.dish = dish;
    }

    public void showMenu() {
        this.dish.showCharacteristics();
    }
}
