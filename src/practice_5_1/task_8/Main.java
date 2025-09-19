package practice_5_1.task_8;

public class Main {
    public static void main(String[] args) {
        Museum museum = new Museum();
        Sculpture sculpture = new Sculpture();
        Manuscript manuscript = new Manuscript();

        museum.addExhibit(manuscript);
        museum.giveInfo();
    }
}
