public class Programs {
    public static void main(String[] args) {
        SpeedCar mersedes = new SpeedCar();
        mersedes.model = "Mersedes GLE";
        mersedes.power = 3.0;
        mersedes.setHorsePower(249);
        mersedes.weight = 2165;
        // System.out.println(mersedes.getInfoSportCar());
        // System.out.printf("Разгон до 100км/ч %s = %.2fсек\n", mersedes.model, SpeedCar.toHundreds(mersedes.weight, mersedes.horsepower));
        // System.out.println();

        SpeedCar mersedesAMG = new SpeedCar();
        mersedesAMG.model = "Mersedes GLE AMG";
        mersedesAMG.power = 5.5;
        mersedesAMG.setHorsePower(585);
        mersedesAMG.weight = 2410;
        // System.out.println(mersedesAMG.getInfoSportCar());
        // System.out.printf("Разгон до 100км/ч %s = %.2fсек\n", mersedes.model, SpeedCar.toHundreds(mersedesAMG.weight, mersedesAMG.horsepower));
        // System.out.println();
        
        SpeedCar bmwX5 = new SpeedCar();
        bmwX5.model = "BMW X5";
        bmwX5.power = 3.0;
        bmwX5.setHorsePower(249);
        bmwX5.weight = 2135;
        // System.out.println(bmwX5.getInfoSportCar());
        // System.out.printf("Разгон до 100км/ч %s = %.2f сек\n", bmwX5.model, SpeedCar.toHundreds(bmwX5.weight, bmwX5.horsepower));
        // System.out.println();

        SpeedCar bmwX5M = new SpeedCar();
        bmwX5M.model = "BMW X5 M";
        bmwX5M.power = 4.4;
        bmwX5M.setHorsePower(625);
        bmwX5M.weight = 2345;
        // System.out.println(bmwX5M.getInfoSportCar());
        // System.out.printf("Разгон до 100км/ч %s = %.2f сек\n", bmwX5M.model, SpeedCar.toHundreds(bmwX5M.weight, bmwX5M.horsepower));
        // System.out.println();

        SpeedCar audiQ7 = new SpeedCar();
        audiQ7.model = "Audi Q7";
        audiQ7.power = 3.0;
        audiQ7.setHorsePower(249);
        audiQ7.weight = 2105;
        // System.out.println(audiQ7.getInfoSportCar());
        // System.out.printf("Разгон до 100км/ч %s = %.2f сек\n", audiQ7.model, SpeedCar.toHundreds(audiQ7.weight, audiQ7.horsepower));
        // System.out.println();

        SpeedCar audiSQ7 = new SpeedCar();
        audiSQ7.model = "Audi SQ7";
        audiSQ7.power = 4.0;
        audiSQ7.setHorsePower(435);
        audiSQ7.weight = 2200;
        // System.out.println(audiSQ7.getInfoSportCar());
        // System.out.printf("Разгон до 100км/ч %s = %.2f сек\n", audiSQ7.model, SpeedCar.toHundreds(audiSQ7.weight, audiSQ7.horsepower));
        // System.out.println();
        // whoFirst(bmwX5M, mersedesAMG);
        // System.out.println();

        Garage garage = new Garage(5);
        garage.add(mersedesAMG);
        garage.add(mersedes);
        garage.add(audiSQ7);
        garage.add(bmwX5M);
        System.out.println(garage.getInfoParking());
        garage.add(audiQ7);
        garage.add(bmwX5);
        garage.getCarInParking();
        garage.out(bmwX5);
        garage.out(audiSQ7);
        garage.getCarInParking();
        System.out.println(garage.getInfoParking());
        garage.add(bmwX5);
        garage.getCarInParking();
        
        
    }
    /**
     * Сравнивает разгон до 100км/ч двух автомобилей
     * @param car1 Параметры первого автомобиля
     * @param car2 Параметры второго автомобиля
     */
    static void whoFirst(SpeedCar car1, SpeedCar car2) {
        double x = (double) SpeedCar.toHundreds(car1.weight, car1.getHorsePower());
        double y = (double) SpeedCar.toHundreds(car2.weight, car2.getHorsePower());
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
