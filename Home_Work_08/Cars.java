public class Cars {
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
    /**
     * Конструктор, принимает все параметры
     */
    public Cars(String nameModel, String valueColor, int valueYear, double valuePower, int priceCar) {
        this.model = nameModel;
        this.year = valueYear;
        this.price = priceCar;
        this.color = valueColor;
        this.power = valuePower;
    }
    /**
     * Конструктор по умолчанию
     */
    public Cars() {
        super();
    }
}