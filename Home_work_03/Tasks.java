package Home_Work_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        task_01();
        // task_02();
        // task_03();

    }   
    static void task_01() {
        // Пусть дан произвольный список целых чисел, удалить из него четные числа
        List<Integer> list = createRandList();
        System.out.print("\033[H\033[J");
        System.out.println("Исходный список => " + list);
        list = delEven(list);
        System.out.println("Без четных чисел => " + list);
    }

    static List<Integer> createRandList() {
    Scanner scan = new Scanner(System.in);
    System.out.printf("Введите размер списка: ");
    int value = scan.nextInt();
    scan.close();
    List<Integer> list = new ArrayList<>();
    Random rand = new Random();
    for (int i = 0; i < value; i++) {
        list.add(rand.nextInt(100));
    }
    return list;
    }
    
    static List<Integer> delEven(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
        return list;
    }

    static void task_02() {
         /*
        Задан целочисленный список ArrayList. Найти минимальное, максимальное 
        и среднее арифметическое из этого списка. Collections.max()
        */   
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите размер массива: ");
        int valueArray = scanner.nextInt();
        scanner.close();
        ArrayList<Integer> arrList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < valueArray; i++) {
            arrList.add(random.nextInt(100));
        }
        System.out.print("\033[H\033[J");
        System.out.println("ArrayList: " + arrList);
        System.out.println("Минимальное значение: " + Collections.min(arrList));
        System.err.printf("Среднее арифметическое: %.2f\n", getAverege(arrList));
        System.out.println("Максимальное значение: " + Collections.max(arrList));
    }

    static double getAverege(ArrayList<Integer> list) {
        double averege = 0;
        for (int i = 0; i < list.size(); i++) {
            averege += list.get(i);
        }
        averege /= list.size();
        return averege;
    }

    static void task_03() {
        /*
        * Реализовать алгоритм сортировки слиянием
        */
        int[] array = {5, 4, 6, 8, 9, 3, 2, 7, 1, -5};
        System.out.println(Arrays.toString(array));
        int[] sortArray = sortArray(array);
        System.out.println(Arrays.toString(sortArray));

    }

    static int[] sortArray(int[] array) {
        int[] temp1 = Arrays.copyOf(array, array.length);
        int[] temp2 = new int[array.length];
        int[] result = merge(temp1, temp2, 0, array.length);
        return result;
    }

    static int[] merge(int[] temp1, int[] temp2, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return temp1;
        }
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = merge(temp1, temp2, startIndex, middle);
        int[] sorted2 = merge(temp1, temp2, middle, endIndex);
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == temp1 ? temp2 : temp1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2] ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
}