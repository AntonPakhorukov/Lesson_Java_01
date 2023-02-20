package Tests;

public class Primary {
    public static void main(String[] args) {
        Cars car1 = new Cars();
        car1.age = 2020;
        car1.power = 249;
        car1.model = "Audi";
        // car1.ageOut = 2023;
        System.out.println(car1); // 2020, 249
        System.err.println(car1.ageOut);
        System.err.println(car1.ageOut2);
        System.out.println("Пробег = " + car1.getMileage()); // Пробег = 0
        car1.setMileage(50000);
        System.out.println("Пробег = " + car1.getMileage()); // Пробег = 50000
        System.out.println(car1.getColor()); // null
        car1.setColor("Dark ocean"); 
        System.out.println(car1.getColor()); // Dark ocean


        Cars car2 = new Cars(20, "BMW");
        System.out.println(car2); // 20, 20
        car2.setMileage(30000);

        Cars car3 = new Cars(2020, 249, "Mersedes", 3, 5);
        System.out.println(car3); // 2023, 249

        Cars car4 = new Cars(2020, 249, "Mersedes GLE", 3, 5);
        // car4.ageOut = 2022;
        System.out.println(car4);

        var first = car1.age - car2.age;
        System.out.println(first);

        var res = Cars.Distance(car1, car2);
        System.out.println(car1.getMileage());
        System.out.println(car2.getMileage());
        System.out.println(res);
        
    }
}
