package practice_2;

public class Laptop {
    String brand;
    int price;

    //конструктор
    Laptop (String someBrand, int somePrice) {
        this.brand = someBrand;
        this.price = somePrice;
    }

    String getBrand() {
        return this.brand;
    }

    int getPrice() {
        return this.price;
    }

    void setPrice(int newPrice) {
        this.price = newPrice;
    }

    void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    void printInfo() {
        System.out.println("Название ноутбука: " + getBrand() + ", стоимость:" + getPrice());
    }
}
