package Seminar_07;

public class Program {
    public static void main(String[] args) {
        Fruit fruit1 = new Fruit();
        fruit1.name = "Apple";
        fruit1.color = "Green";
        fruit1.weight = 1;
        fruit1.price = 150;

        Car car1 = new Car();
        car1.model = "Mersedes GLE";
        car1.power = 3.0;
        car1.color = "Black ocean";
        car1.year = 2022;
        car1.price = 4000000;
        // System.out.println(car1.getInfo());

        Car car2 = new Car("Audi", "White", 2022, 3.0, 3500000);
        // System.out.println(car2.getInfo());

        car1.road("Иркутск");
        car1.powerOn();
        car1.road("Иркутск");
        car1.powerOff();
    }
}
