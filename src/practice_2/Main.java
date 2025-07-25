package practice_2;

public class Main {
    public static void main(String[] args) {

        Car volvo = new Car("Volvo", 2020);
        volvo.setYear(2025);
        volvo.print();

        Rectangle ten = new Rectangle(10, 10);
        ten.setWidth(12);
        System.out.println(ten.calculateArea());

        Book scary = new Book("Страшная история", "Ю. Жнец");
        scary.setAuthor("У. Жнец");
        scary.printInfo();

        BankAccount tips = new BankAccount("Kolya", 3000);
        tips.printBalance();
        tips.deposit(1000);
        tips.printBalance();
        tips.withdraw(500.5);
        tips.printBalance();

        Point home = new Point(55.2144, 47.3321);
        home.setX(56.1252);
        home.print();

        StudentGroup firstCourse = new StudentGroup("Перваши", 89);
        firstCourse.setStudentCount(95);
        firstCourse.printInfo();

        Circle newCircle = new Circle(10);
        newCircle.setRadius(10);
        System.out.println(newCircle.calculateArea());
        System.out.println(newCircle.calculateCircumference());

        Teacher ushkova = new Teacher("Ушкова", "математика");
        ushkova.setSubject("физика");
        ushkova.printInfo();

        Product laptop = new Product("Macbook", 1000);
        laptop.setPrice(1250);
        laptop.applyDiscount(10);
        System.out.println(laptop.getPrice());

        Laptop lenovo = new Laptop("Lenovo", 600);
        lenovo.setPrice(500);
        lenovo.printInfo();
    }
}
