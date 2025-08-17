package practice_3;

public class Main {
    public static void main(String[] args) {
        Company company1 = new Company(1, "Peter");
        Company.printCompanyName();
        Company company2 = new Company(2, "Kolya");
        Company.printCompanyName();


        Company.companyName = "newCompanyName";
        Company.printCompanyName();

        System.out.println(MathConstants.calculateCircleArea(3.11));
        System.out.println(MathConstants.calculateCircleArea(5.591));
        System.out.println(MathConstants.calculateCircumference(3.421));
        System.out.println(MathConstants.calculateCircumference(192.54323));

        Library home = new Library();

        University max = new University(10, "Max");
        University nick = new University(11, "Nick");
        University julia = new University(12, "Julia");
        julia.printStudentInfo();

        University.changeUniversityName("Polytech");
        julia.printStudentInfo();

        GameSettings tetris = new GameSettings("Tetris", 12);
        GameSettings mario = new GameSettings("Mario", 1);
        tetris.printGameStatus();
        mario.printGameStatus();

        GameSettings.setMaxPlayers(12);
        tetris.addPlayer();
        tetris.printGameStatus();

        Person ivan = new Person("Иван", "Иванов", "123-45-6789");
        Person nastya = new Person("Анастасия", "Петрова", "552-56-1354");
        Person vova = new Person("Владимир", "Ильин", "235-12-5433");

        ivan.printPersonInfo();
        ivan.setFirstName("Николай");
        ivan.printPersonInfo();
        nastya.printPersonInfo();
        vova.printPersonInfo();
    }
}


