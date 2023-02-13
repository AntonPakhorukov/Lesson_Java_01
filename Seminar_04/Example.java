package Seminar_04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

import javax.swing.text.ComponentView;

public class Example {

    public static void main(String[] args) {
        // ex_01();
        ex_02();
        // ex_04();
        // ex_05();
    }
    static void ex_01() {
        // 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
        // 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.
        ArrayList<Integer> list1 = new ArrayList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list1.add(5);
        }
        long finishTime = System.currentTimeMillis();
        System.out.println("ArrayList: " + (finishTime - startTime)); // ArrayList: 20
        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list2.add(5);
        }
        long finishTime2 = System.currentTimeMillis();
        System.out.println("LinkedList: " + (finishTime2 - startTime2)); // LinkedList: 159
    }

    static void ex_02() {
        /*
        Реализовать консольное приложение, которое:
        Принимает от пользователя строку вида text~num
        Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
        Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
         */
        Scanner scan = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        while(true) {
            String[] line = scan.nextLine().split("~");
            if (line[0].equals("end")) {
                break;
            }
            if (!check(list, line)) {
                continue;
            }
            if (line[0].equals("print")) {
                String word = list.get(Integer.parseInt(line[1]));
                list.remove(Integer.parseInt(line[1]));
                System.out.println(word);
            } else {
                list.add(Integer.parseInt(line[1]), line[0]);
            }
        }   
        scan.close();    
    }

    static boolean check(LinkedList<String> list, String[] line) {
        // try {
        //     list.add(Integer.parseInt(line[1]), line[0]);
        // } catch (Exception e) {
        //     System.out.println("Введена не верная команда");
        //     continue;
        // }
        if (!line[1].matches("[0-9]+")) { // match - совпадение
            System.out.println("Введена неверная команда");
            return false;
        } 
        int index = Integer.parseInt(line[1]);
        if (index > list.size()) {
            System.out.println("Введена неверная команда");
            return false;
        }
        return true;
    }

    static void ex_03() {
        /*
        Реализовать консольное приложение, которое:
        Принимает от пользователя и “запоминает” строки.
        Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
        Если введено revert, удаляет предыдущую введенную строку из памяти.
        */

    }

    static void ex_04() {
        /*
        1) Написать метод, который принимает массив элементов, 
        помещает их в стэк и выводит на консоль содержимое стэка.
        2) Написать метод, который принимает массив элементов, 
        помещает их в очередь и выводит на консоль содержимое очереди.
        */
        int[] array = new int[]{4, 5, 6, 3, 2, 1};
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }
        System.out.println(stack); // [4, 5, 6, 3, 2, 1]
        System.out.println(stack.getClass().getName()); // java.util.Stack

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            queue.add(array[i]);
        }
        System.out.println(queue); // [4, 5, 6, 3, 2, 1]
        System.out.println(queue.getClass().getName()); // java.util.LinkedList
        System.out.println(queue.poll()); // Выводит первый элемент и удаляет его из очереди - 4
        System.out.println(queue); // [5, 6, 3, 2, 1]
        System.out.println(queue.peek()); // Выведет первый элемент не удаляя его из очереди - 5
        System.out.println(queue); // [5, 6, 3, 2, 1]

    }
    
    static void ex_05() {
        /*
        Реализовать стэк с помощью массива. 
        Нужно реализовать методы:
        size(), empty(), push(), peek(), pop().
        */
        MyStack myStack = new MyStack(4);
        System.out.println("Size: " + myStack.size());
        myStack.push(5); // Определен как добавление элемента
        myStack.push(4); // Если в массиве нет места для новых элементов
        myStack.push(2); // Массив создастся новый
        myStack.push(10);
        myStack.push(7);
        myStack.push(50);
        System.out.println(myStack.peek()); // Определен как вывод последнего элемента массива
        System.out.println(myStack.peek()); // Определен как вывод последнего элемента массива
        System.out.println(myStack.peek()); // Определен как вывод последнего элемента массива

        System.out.println("Size: " + myStack.size()); // 6
        System.out.println(myStack); // [5, 4, 2, 10, 7, 50]
        System.out.println();
        System.out.println(myStack.pop()); // Определен как вывод последнего элемента с его удалением - 50
        System.out.println(myStack.pop()); // 7
        System.out.println(myStack.pop()); // 10

        System.out.println(myStack); // [5, 4, 2]
        myStack.push(33);
        System.out.println(myStack); // [5, 4, 2, 33]
    }
}
