package Home_Work_01;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Введите номер задачи: ");
        boolean tk = scan.hasNextInt();
        if (tk == false) {
            System.out.println("Не корректный ввод");
            return;
        }
        int task = scan.nextInt();
        switch (task) {
            case 1:
                System.out.printf("Введите число: ");
                int number = scan.nextInt();
                task_01_hw(number);
                break;
            case 2:
                System.out.println("Введите число: ");
                int num = scan.nextInt();
                int result = task_02_hw(num);
                System.out.printf("Ответ: %d", result);
                break;
            case 3:
                System.out.println("Введите число: ");
                int value = scan.nextInt();
                task_03_hw(value);
                break;
            case 4:
                System.out.printf("Введите первое число: ");
                boolean flagX = scan.hasNextDouble();
                if (flagX == false) {
                    System.out.println("Не корректный ввод");    
                    return;
                }
                double x = scan.nextDouble();
                System.out.printf("Введите второе число: ");
                boolean flagY = scan.hasNextDouble();
                if (flagY == false) {
                    System.out.println("Не корректный ввод");
                    return;
                }
                double y = scan.nextDouble();
                System.out.printf("Введите операцию: ");
                String val = scan.next();
                task_04_hw(x, y, val);
                break;
            default:
                System.out.println("Задачи с таким номером не существует");
        }
        
        
    }
    static void task_01_hw(int a) {
        /*
        Вычислить n-ое треугольного число(сумма чисел от 1 до n)
         */
        int res = 0;
        for (int i = 1; i <= a; i++) {
            res += i;
        }
        System.out.printf("Ответ: %d", res);
    }

    static int task_02_hw(int a) {
        /*
        Вычислить n! (произведение чисел от 1 до n)
         */
        if (a == 0) {
            return 1;
        } else {
            return a * task_02_hw(a - 1);
        }
    }

    static void task_03_hw(int a) {
        /*
        Вывести все простые числа от 1 до 1000 (простые числа - это числа которые делятся только 
        на себя и на единицу без остатка. 
        Чтобы найти остаток от деления используйте оператор % , например 10%3 будет равно единице)
         */
        for (int i = 2; i <= a; i++) {
            boolean value = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    value = false;
                    break;
                } 
            }
            if (value == true) {
                System.out.printf("%d ", i);
            }
        }
    }

    static void task_04_hw(Double x, Double y, String val) {
        /*
        Реализовать простой калькулятор ("введите первое число"... 
        "Введите второе число"... "укажите операцию, 
        которую надо выполнить с этими числами"... "ответ: ...")
         */
        if (val.equals("+")) {
            System.out.printf("Ответ: %.2f", x + y);
        } else if (val.equals("-")) {
            System.out.printf("Ответ: %.2f", x - y);
        } else if (val.equals("/")) {
            System.out.printf("Ответ: %.2f", x / y);
        } else if(val.equals("*")) {
            System.out.printf("Ответ: %.2f", x * y);
        } else {
            System.out.println("Не корректный ввод операции");
        }
    }

    static void task_05_hw() {
        /*
         Задано уравнение вида q + w = e, где q, w, e >= 0. 
         Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
         Требуется восстановить выражение до верного равенства. 
         Предложить хотя бы одно решение или сообщить, что его нет.
         */
    }
}
