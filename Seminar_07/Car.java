package Seminar_07;
/**
 * Напишите класс Car.
 * В классе должна храниться информация:
 * Название автомобиля - model
 * год выпуска - year
 * Стоимость - price
 * цвет - color
 * объем двигателя - power 
 * 
 * Доработать класс:
 * Добавить в класс Car метод getInfo без параметров, который будет печатать на экране
 * значение полей объекта  класса model, power, year.
 * 
 * Доработать класс:
 * В классе должна храниться следующая информация:
 * Свойство - которое говорит, заведен автомобиль или нет
 * Метод - запуска автомобиля
 * Метод - остановки автомобиля
 * Метод дороги - при вызове, в качестве аргумента передаем место назначения
 * И если авто заведен - выводим, что мы на таком то авто едем в место назначения
 * Если не заведен - сообщить, что авто не заведено. И мы не можем ехать.
 */
public class Car {
    String model;
    int year;
    int price;
    String color;
    double power;
    /*private*/ State state;
    // String road;


    public void road(String map) {
        if (this.state == State.On) {
            System.out.printf("Мы на автомобиле %s едем в %s\n", model, map);
        } else {
            System.out.printf("Автомобиль не заведен. Мы не можем ехать\n");
        }
    }

    // public void power(){
    //     if (this.state == State.Off) {
    //         this.powerOn();
    //         this.state = State.On;
    //     } else {
    //         this.powerOff();
    //         this.state = State.Off;
    //     }
    //     System.out.println();
    // }


    /*private*/ public void powerOff() {
        System.out.println("Автомобиль не заведен");
        this.state = State.Off;
    }

    /*private*/ public void powerOn(){
        System.out.println("Автомобиль заведен");
        this.state = State.On;
    }

    enum State {
        On, Off
    }

    public String getInfo() {
        return String.format("model: %s, color: %s, power: %.1f, year: %d, price: %d", model, color, power, year, price);
    }

    public Car(String nameModel, String valueColor, int valueYear, double valuePower, int priceCar) {
        this.model = nameModel;
        this.year = valueYear;
        this.price = priceCar;
        this.color = valueColor;
        this.power = valuePower;
    }
    public Car() {
        super();
    }
    
}
