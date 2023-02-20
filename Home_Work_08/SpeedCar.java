public class SpeedCar extends Cars{
    private int horsepower;
    int weight;
    
    /**
     * Считает время разгона с 0 до 100км/ч
     * @param weight Вес автомобиля
     * @param horsepower л.с.
     * @return Возвращает время разгона
     */
    public static double toHundreds(int weight, int horsepower) {
        double toHundreds = (double) weight / (double) horsepower;
        return toHundreds;
    }
    /**
     * Выводит краткую информация о спортивном автомобиле
     * @return
     */
    public String getInfoSportCar(){
        return String.format("Авто: %s, Объем двигателя: %.1f, Мощность двигателя: %d, Вес: %d", this.model, this.power, horsepower, weight);
    }

    @Override
    public String toString() {
        return String.format("Автомобиль %s", model);
    }

    public void setHorsePower(int horsepower) {
        this.horsepower = horsepower;
    }

    public int getHorsePower() {
        return horsepower;
    }
}