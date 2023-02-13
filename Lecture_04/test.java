package Lecture_04;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class test {
    public static void main(String[] args) {
        // long start = System.currentTimeMillis();
        // LinkedList<Integer> list = new LinkedList<>();
        // for (int i = 0; i < 10000000; i++) {
        //     list.add(10);
        // }
        // long finish = System.currentTimeMillis();
        // System.out.println(finish - start);
        // long start2 = System.currentTimeMillis();
        // LinkedList<Integer> list2 = new LinkedList<>();
        // for (int i = 0; i < 10000000; i++) {
        //     list2.addFirst(5);
        // }
        // long finish2 = System.currentTimeMillis();
        // System.out.println(finish2 - start2);
        
        // LinkedList<Integer> list = new LinkedList<>();
        // for (int i = 1; i < 11; i++) {
        //     list.add(i);
        // }
        // System.out.println(list);
        // list.add(2, 10);
        // System.out.println(list);
        // list.remove(4);
        // System.out.println(list);
        // list.set(4, 4);
        // System.out.println(list);

        // Stack<Integer> stack = new Stack<>();
        
        
        //garbage collector

        Queue<Integer> queue = new LinkedList<>(); 
        for (int i = 0; i < 5; i++) {
            queue.add(i);
        }
        System.out.println(queue); // [0, 1, 2, 3, 4]
        queue.remove(2);
        System.out.println(queue); // [0, 1, 3, 4]
        queue.remove();
        System.out.println(queue); // [1, 3, 4]
        int item = queue.remove();
        System.out.println(item); // 1
        System.out.println();
        LinkedList<Integer> li = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            li.add(i);
        }
        System.out.println(li); // [0, 1, 2, 3, 4]
        li.remove();
        System.out.println(li); // [1, 2, 3, 4]
        


    }
}
