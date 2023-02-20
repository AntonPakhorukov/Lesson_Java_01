package Seminar_08;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private int maxCapasity; // Вместимость
    
    private List<Product> list = new ArrayList<>();
    
    public VendingMachine(int maxCapasity, List<Product> list) {
        this.maxCapasity = maxCapasity;
        this.list = list;
    }

    public VendingMachine(int maxCapasity) {
        this.maxCapasity = maxCapasity;
    }

    public Product getProductName(String name) throws Exception{
        for (Product product : list) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        throw new Exception("Продукт не найден");
    }

    public Product getProductPrice(double price) throws Exception{
        for (Product product : list) {
            if (product.getPrice() == price) {
                return product;
            }
        }
        throw new Exception("Продукт не найден");
    }

    public void add(Product product) {
        if (list.size() < maxCapasity) {
            list.add(product);
        } else {
            System.out.println("Автомат переполнен");
        }
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
