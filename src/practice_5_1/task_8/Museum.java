package practice_5_1.task_8;

public class Museum {

    private Exhibit exhibit;

    public void addExhibit(Exhibit exhibit) {
        this.exhibit = exhibit;
    }

    public void giveInfo() {
        this.exhibit.own();
    }
}
