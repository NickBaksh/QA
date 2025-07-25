package practice_2;

public class Product {
    String name;
    double price;

    //конструктор
    Product (String someName, double somePrice) {
        this.name = someName;
        this.price = somePrice;
    }

    String getName() {
        return name;
    }

    double getPrice() {
        return price;
    }

    void setPrice(double newPrice) {
        this.price = newPrice;
    }

    double applyDiscount(int discount) {
        double perc = (double) discount / 100;
        this.price = this.price * (1 - perc);
        return perc;
    }
}
