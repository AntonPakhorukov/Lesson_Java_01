package Lecture_05;

import java.util.*;

public class Ex002_HashMapEntry {
    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>();
        db.putIfAbsent(1, "один");
        db.put(2, "два");
        db.put(3, "три");
        System.out.println(db); // {1=один, 2=два, 3=три}

        for (var item : db.entrySet()) { // итератор, с помощью которого можно пробежаться по элементам
            System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
        } // [1: один] [2: два] [3: три]

        System.out.println(db.entrySet()); // [1=один, 2=два, 3=три]
    }
}