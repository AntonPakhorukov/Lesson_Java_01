package Home_Work_07;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    private int parkingSpace;
    private int maxCapasity;
    private int freeParking;
    private List<SpeedCar> cars = new ArrayList<>();

    public Garage(int maxCapasity, List<SpeedCar> cars) {
        this.maxCapasity = maxCapasity;
        this.cars = cars;
    }

    public Garage(int maxCapasity) {
        this.maxCapasity = maxCapasity;
    }

    public void add(SpeedCar car){
        if (cars.size() < maxCapasity) {
            cars.add(car);
            parkingSpace++;
            freeParking = maxCapasity - parkingSpace;
            System.out.printf("На стоянку в гараж заехал автомобиль %s\n", car.model);
        } else {
            System.out.printf("Гараж заполнен, поставить на стоянку в гараж автомобиль %s не возможно\n", car.model);
        }
    }

    public void out(SpeedCar car) {
        if (cars.contains(car)) {
            cars.remove(car);
            parkingSpace--;
            freeParking = maxCapasity - parkingSpace;
            System.out.printf("Автомобиль %s выехал из гаража\n", car.model);
        } else {
            System.out.println("Такого автомобиля нет на парковке в гараже");
        }
    }

    @Override
    public String toString() {
        return cars.toString();
    }

    public void getQuantityCarInParking(){
        System.out.println("В гараже стоят следующие машины:");
        for (SpeedCar speedCar : cars) {
            System.out.println(speedCar.model);
        }
    }

    public String getFreeParking() {
        return String.format("Количество свободных парковочных мест = %s", freeParking);
    }

    public String getParkingSpace() {
        return String.format("Количество занятых парковочных мест = %s", parkingSpace);
    }

    public String getCapasityParking() {
        return String.format("Вместимость парковки = %s", maxCapasity);
    }
}
