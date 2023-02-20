package Home_Work_07;

public class Programs {
    public static void main(String[] args) {
        // Fruits fruit1 = new Fruits();
        // fruit1.name = "Apple";
        // fruit1.color = "Green";
        // fruit1.weight = 1;
        // fruit1.price = 150;

        // Cars car1 = new Cars();
        // car1.model = "Mersedes GLE";
        // car1.power = 3.0;
        // car1.color = "Black ocean";
        // car1.year = 2022;
        // car1.price = 4000000;
        // // System.out.println(car1.getInfo());

        // Cars car2 = new Cars("Audi", "White", 2022, 3.0, 3500000);
        // // System.out.println(car2.getInfo());

        // car1.road("Иркутск");
        // car1.powerOn();
        // car1.road("Иркутск");
        // car1.powerOff();

        SpeedCar mersedes = new SpeedCar();
        mersedes.model = "Mersedes GLE";
        mersedes.power = 3.0;
        mersedes.horsepower = 249;
        mersedes.weight = 2165;
        // System.out.println(mersedes.getInfoSportCar());
        // System.out.printf("Разгон до 100км/ч %s = %.2fсек\n", mersedes.model, SpeedCar.toHundreds(mersedes.weight, mersedes.horsepower));
        // System.out.println();

        SpeedCar mersedesAMG = new SpeedCar();
        mersedesAMG.model = "Mersedes GLE AMG";
        mersedesAMG.power = 5.5;
        mersedesAMG.horsepower = 585;
        mersedesAMG.weight = 2410;
        // System.out.println(mersedesAMG.getInfoSportCar());
        // System.out.printf("Разгон до 100км/ч %s = %.2fсек\n", mersedes.model, SpeedCar.toHundreds(mersedesAMG.weight, mersedesAMG.horsepower));
        // System.out.println();
        
        SpeedCar bmwX5 = new SpeedCar();
        bmwX5.model = "BMW X5";
        bmwX5.power = 3.0;
        bmwX5.horsepower = 249;
        bmwX5.weight = 2135;
        // System.out.println(bmwX5.getInfoSportCar());
        // System.out.printf("Разгон до 100км/ч %s = %.2f сек\n", bmwX5.model, SpeedCar.toHundreds(bmwX5.weight, bmwX5.horsepower));
        // System.out.println();

        SpeedCar bmwX5M = new SpeedCar();
        bmwX5M.model = "BMW X5 M";
        bmwX5M.power = 4.4;
        bmwX5M.horsepower = 625;
        bmwX5M.weight = 2345;
        // System.out.println(bmwX5M.getInfoSportCar());
        // System.out.printf("Разгон до 100км/ч %s = %.2f сек\n", bmwX5M.model, SpeedCar.toHundreds(bmwX5M.weight, bmwX5M.horsepower));
        // System.out.println();

        SpeedCar audiQ7 = new SpeedCar();
        audiQ7.model = "Audi Q7";
        audiQ7.power = 3.0;
        audiQ7.horsepower = 249;
        audiQ7.weight = 2105;
        // System.out.println(audiQ7.getInfoSportCar());
        // System.out.printf("Разгон до 100км/ч %s = %.2f сек\n", audiQ7.model, SpeedCar.toHundreds(audiQ7.weight, audiQ7.horsepower));
        // System.out.println();

        SpeedCar audiSQ7 = new SpeedCar();
        audiSQ7.model = "Audi SQ7";
        audiSQ7.power = 4.0;
        audiSQ7.horsepower = 435;
        audiSQ7.weight = 2200;
        // System.out.println(audiSQ7.getInfoSportCar());
        // System.out.printf("Разгон до 100км/ч %s = %.2f сек\n", audiSQ7.model, SpeedCar.toHundreds(audiSQ7.weight, audiSQ7.horsepower));
        // System.out.println();
        // whoFirst(bmwX5M, mersedesAMG);
        // System.out.println();

        Garage garage = new Garage(5);
        garage.add(mersedesAMG);
        garage.add(mersedes);
        // garage.getQuantityCarInParking();
        // System.out.println(garage.getCapasityParking());
        // System.out.println(garage.getFreeParking());
        // System.out.println(garage.getParkingSpace());
        garage.add(audiSQ7);
        garage.add(bmwX5M);
        // garage.getQuantityCarInParking();
        System.out.println(garage.getCapasityParking());
        System.out.println(garage.getFreeParking());
        System.out.println(garage.getParkingSpace());
        garage.add(audiQ7);
        garage.add(bmwX5);
        garage.getQuantityCarInParking();
        garage.out(bmwX5);
        garage.out(audiSQ7);
        garage.getQuantityCarInParking();
        System.out.println(garage.getCapasityParking());
        System.out.println(garage.getFreeParking());
        System.out.println(garage.getParkingSpace());
        garage.add(bmwX5);
        garage.getQuantityCarInParking();
        
        
    }
    /**
     * Сравнивает разгон до 100км/ч двух автомобилей
     * @param car1 Параметры первого автомобиля
     * @param car2 Параметры второго автомобиля
     */
    static void whoFirst(SpeedCar car1, SpeedCar car2) {
        double x = (double) SpeedCar.toHundreds(car1.weight, car1.horsepower);
        double y = (double) SpeedCar.toHundreds(car2.weight, car2.horsepower);
        double res;
        if (x < y) {
            res = (double)y - (double)x;
            System.out.printf("Разгон быстрее будет у %s на %.2f сек", car1.model, res);
        } else {
            res = (double)x - (double)y;
            System.out.printf("Разгон быстрее будет у %s на %.2f", car2.model, res);
        }
    }
}
