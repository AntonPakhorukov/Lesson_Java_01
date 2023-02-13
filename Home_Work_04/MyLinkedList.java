package Home_Work_04;


import java.util.LinkedList;
import java.util.Queue;

// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

public class MyLinkedList {
    private Queue<Integer> queue;// = new LinkedList<>();
    
    MyLinkedList() {
        queue = new LinkedList<>();
    }

    void enqueue(int el) {
        queue.add(el);
    }
    int dequeue() {
        int num = queue.remove();
        return num;
    }
    int first() {
        int num = queue.peek();
        return num;
    }
    Queue<Integer> print() {
        Queue<Integer> q = new LinkedList<>();
        for (Integer integer : queue) {
            q.add(integer);
        }
        return q;
    }
}
