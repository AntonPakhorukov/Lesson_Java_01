import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.time.LocalTime;

public class Seminar {
    public static void main(String[] args) {
        //task_01();

        //task_02();

        // int[] array = new int[10];
        // Random rand = new Random();
        // for (int i = 0; i < array.length; i++) {
        //     array[i] = rand.nextInt(2);
        // }
        // int res = task_03(array, 1);
        // // for (int j = 0; j < array.length; j++) {
        // //     System.out.printf("%d ", array[j]); // 0 0 1 1 1 1 0 0 1 1
        // // }
        // System.out.println(Arrays.toString(array)); // [1, 1, 0, 0, 1, 0, 1, 1, 0, 1]
        // System.out.println(res);

        // task_04();

        task_05();

    }
    static void task_01() {
        /*
        Написать программу, которая запрашивает имя пользователя и выводит его 
        в консоль.
         */
        System.out.println("Введите ваше имя: ");
        try (Scanner scan = new Scanner(System.in)) {
            String name = scan.nextLine();
            System.out.printf("Привет, %s!", name);
        }    
    }

    static void task_02() {
        /*
        Написать программу, которая запрашивает имя пользователя и здоровается 
        с пользователем с учетом текущего времени - доброе утро, день, вечер, ночь
         */
        System.out.println("Введите ваше имя: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        scan.close();
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

    static int task_03(int[] array, int a) {
        /*
        Дан массив двоичных чисел, например [1,1,0,1,1,1,0]
        Вывести максимальное количество подряд идущих 1
        */
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == a) {
                count++;
            } else {
                if(maxCount < count) {
                    maxCount = count;
                }
                count = 0;
            }
        }
        if(maxCount < count) {
            maxCount = count;
        }
        return maxCount;    
    }

    static void task_04() {
    /*
    Дан массив nums = [3,2,5,3] и число val = 3.
    Если в массиве есть числа, равные заданному, нужно перенести
    эти элементы в конец массива.
    Таким образом, первые несколько элементов (или все) элементов массива
    должны быть отличны от заданного, а остальные - равны ему.
     */
        int[] array = new int[] {3, 2, 5, 3, 3, 4, 5, 3};
        int val = 3;
        long time = System.currentTimeMillis();
        int count = 0;
        while(count < array.length) {
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] == val) {
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                } 
            }
            count++;
        } 
        long res = System.currentTimeMillis() - time;
        long time2 = System.currentTimeMillis();        
        int[] arr = new int[array.length];
        Arrays.fill(arr, 3); // заполнит весь массив 3
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (array[i] != 3) {
                arr[j] = array[i];
                j++;
            }
        }
        long res2 = System.currentTimeMillis() - time2;
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arr));
        System.out.printf("%.5s\n", res);
        System.out.println(res2);

    }

    static void task_05() {
    /*
    Во фразе "Добро пожаловать на курс по Java"
    переставить слова в обратном порядке
    */  
    String str = "Добро пожаловать на курс по Java";
    String[] array = str.split(" ");
    String result = "";
    for (int i = array.length - 1; i >= 0; i--) {
        result += array[i];
        result += " ";
    }
    System.out.println(result);
    
    }

}