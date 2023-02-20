package Seminar_08;

public class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " " + price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
