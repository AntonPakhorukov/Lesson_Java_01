package Lecture_05;

import java.util.*;
 
public class Ex001_HashMap {
    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>();
        db.putIfAbsent(1, "один"); 
        db.put(2, "два"); 
        db.put(3, "три");
        db.put(null, "!null"); 
        System.out.println(db); // {null=!null, 1=один, 2=два}
        // System.out.println(db); // {1=один, 2=два, 3=три}
        // db.put(2, "двадцать"); // Если такой ключ есть, то перезапишет значение
        // System.out.println(db); // {1=один, 2=двадцать, 3=три}
        // db.putIfAbsent(1, "одинадцать"); // если такой ключ есть, ни чего не сделает
        // System.out.println(db); // {1=один, 2=двадцать, 3=три}
        System.out.println(db.get(44)); // null
        System.out.println(db.get(2)); // два
        db.remove(null); 
        System.out.println(db); // {1=один, 2=два}
        System.out.println(db.containsValue("один")); // true
        System.out.println(db.containsValue(1)); // false
        System.out.println(db.containsKey("один")); // false
        System.out.println(db.containsKey(1)); // true
        System.out.println(db.keySet()); // [1, 2, 3]
        System.out.println(db.values()); // [один, два, три]


    }
}