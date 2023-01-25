import java.util.Scanner;
import java.util.jar.Attributes.Name;
import java.time.*;

public class Seminar {
    public static void main(String[] args) {
        //task_01();
        task_02();

    }
    static void task_01() {
        System.out.println("Введите ваше имя: ");
        try (Scanner scan = new Scanner(System.in)) {
            String name = scan.nextLine();
            System.out.printf("Привет, %s!", name);
        }    
    }

    static void task_02() {
        System.out.println("Введите ваше имя: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        LocalTime lt = LocalTime.now();
        int hour = lt.getHour();
        if (hour >= 5 && hour < 12) {
            System.out.printf("Доброе утро, %s!", name);
        } else if (hour >= 12 && hour < 18) {
            System.out.printf("Доброе день, %s!", name);
        } else if (hour >= 18 && hour < 23) {
            System.out.printf("Доброе вечер, %s!", name);
        } else {
            System.out.printf("Доброе ночи, %s!", name);
        }
    }

}