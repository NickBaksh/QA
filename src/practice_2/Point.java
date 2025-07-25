package practice_2;

public class Point {
    double x;
    double y;

    //конструктор
    Point (double someX, double someY) {
        this.x = someX;
        this.y = someY;
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }

    void setX(double newX) {
        this.x = newX;
    }

    void print() {
        System.out.println("Координаты: " + x + ", " + y);
    }
}
