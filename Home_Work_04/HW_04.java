package Home_Work_04;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class HW_04 {
    /*
    Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
    */
    public static void main(String[] args) {
        
        // Задача 1:
        // LinkedList<Integer> list = createRandList();
        // System.out.println("Исходный список " + list);
        // list = turnList(list);
        // System.out.println("Первый метод " + list);
        // list = turnList2(list);
        // System.out.println("Второй метод " + list);

        // Задача 2:
        task2();

        // Задача 3: 
        // LinkedList<Integer> list = createRandList();
        // System.out.println(list);
        // System.out.println("Через for each: " + sumList(list));
        // System.out.println("Через итератор: " + sumIterator(list));
    }

    static LinkedList<Integer> createRandList() {
        LinkedList<Integer> listStart = new LinkedList<>();
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер списка: ");
        int length = scan.nextInt();
        scan.close();
        for (int i = 0; i < length; i++) {
            listStart.add(rand.nextInt(100));
        }
        return listStart;
    }

    static LinkedList<Integer> turnList(LinkedList<Integer> list) {
        /*
        Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
        */
        LinkedList<Integer> newList = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            newList.add(list.get(i));
        }
        return newList;   
    }

    static LinkedList<Integer> turnList2(LinkedList<Integer> list) {
        /*
        Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
        */
        Collections.reverse(list);
        return list;
    }

    static void task2() {
        /*
        Реализуйте очередь с помощью LinkedList со следующими методами:
        enqueue() - помещает элемент в конец очереди, 
        dequeue() - возвращает первый элемент из очереди и удаляет его, 
        first() - возвращает первый элемент из очереди, не удаляя.
        */
        //Queue<Integer> queue = new LinkedList<>();
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.enqueue(1); // добавили в конец число
        myLinkedList.enqueue(2);
        myLinkedList.enqueue(3);
        myLinkedList.enqueue(4);
        myLinkedList.enqueue(5);
        myLinkedList.enqueue(6);
        System.out.println(myLinkedList.print()); // [1, 2, 3, 4, 5, 6]
        int number = myLinkedList.dequeue();
        System.out.println(number); // Выведет 1 и удалит ее из очереди
        System.out.println(myLinkedList.print()); // [2, 3, 4, 5, 6]
        System.out.println(myLinkedList.dequeue()); // аналогично, выведет 2 и удалит ее из очереди
        System.out.println(myLinkedList.print()); // [3, 4, 5, 6]
        int num = myLinkedList.first(); // присвоит 3 не удаляя ее из очереди
        System.out.println(num); // 3 
        System.out.println(myLinkedList.print()); // [3, 4, 5, 6] - 3 не удалена
        System.out.println(myLinkedList.first()); // 3
        System.out.println(myLinkedList.print()); // [3, 4, 5, 6]
    }

    static int sumList(LinkedList<Integer> list) {
        /*
        Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
        */
        int sum = 0;
        for (int item : list) {
            sum += item;
        }
        return sum;

    }

    static int sumIterator(LinkedList<Integer> list){ 
        int sum = 0;
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()) {
            sum += iter.next();
        }
        return sum;
    }

}
