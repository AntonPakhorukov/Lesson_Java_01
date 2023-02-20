package Tests;
/**
 * Это класс автомобиля
 */
public class Cars {
    int age;
    int power;
    String model;
    
    private int discount = 3; // не увидим в доступе у экземпляра класса
    public int discount2 = 5; // увидим в доступе у экземпляра класса
    private String color;
    private int mileage;
    

    public String getColor() {
        return color;
    }

    public int getMileage() {
        return mileage;
    }
    public String setColor(String col) { // не верная запись
        color = col;
        return color;
    }

    public void setMileage(int mile) { // верная запись
        this.mileage = mile;
    }





    int ageOut = age;
    int ageOut2 = age;

    @Override
    public String toString() {
        return String.format("%d, %d, %s, %d, %d", age, power, model, ageOut, ageOut2);
    }
    /**
     * 
     * @param valueAge это год выпуска автомобиля
     * @param valuePower это мощность автомобиля
     * @param modelNmae это модель автомобиля
     * @param valueAgeOut это минимальный год выпуска с хорошим дисконтом
     * @param valueAgeOut2 это минимальный год выпуска с хорошим дисконтом
     */
    public Cars(int valueAge, int valuePower, String modelNmae, int valueAgeOut, int valueAgeOut2) { // можно реализовать ввод для каждой переменной
        age = valueAge;
        power = valuePower;
        model = modelNmae;
        ageOut = age - discount;
        ageOut2 = valueAge - discount2;
    }
    // public Cars(int value, String modelName, int valueAgeOut, int valueAgeOut2) { // можно реализовать один ввод для обеих переменных
    //     age = value;
    //     power = value;
    //     model = modelName;
    //     ageOut = value - discount;
    //     ageOut2 = value - discount2;

    // }
    // public Cars() { // конструктор по умолчанию
    //     age = 0;
    //     power = 0;
    //     model = null;
    //     ageOut -= discount;
    //     ageOut2 -= discount2;
    // }

    //Ver2====================

    public Cars(int value, String str) {
        this(value, value, str, value, value);
    }

    public Cars() {
        this(0, 0, null, 0, 0);
    }

    public static int Distance(Cars car1, Cars car2) {
        return car1.mileage - car2.mileage;
    }
    
}
