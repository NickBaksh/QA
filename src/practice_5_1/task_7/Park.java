package practice_5_1.task_7;

public class Park {

    private Attraction attraction;

    public void addAttraction(Attraction attraction) {
        this.attraction = attraction;
    }

    public void showInfo() {
        this.attraction.operate();
    }
}
