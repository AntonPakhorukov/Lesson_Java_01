package Lecture_05;

import java.util.*;

public class Ex004_TreeMap {
    public static void main(String[] args) {
        TreeMap<Integer,String> tMap = new TreeMap<>();
        tMap.put(1,"один"); System.out.println(tMap); 
        // {1=один}
        tMap.put(6,"шесть"); System.out.println(tMap);
        // {1=один, 6=шесть}
        tMap.put(4,"четыре"); System.out.println(tMap);
        // {1=один, 4=четыре, 6=шесть} - идет сортировка по ключу
        tMap.put(3,"три"); System.out.println(tMap);
        // {1=один, 3=три, 4=четыре, 6=шесть}
        tMap.put(2,"два"); System.out.println(tMap);
        // {1=один, 2=два, 3=три, 4=четыре, 6=шесть}
        System.out.println(tMap.descendingKeySet()); // [6, 4, 3, 2, 1]
        System.out.println(tMap.descendingMap()); // {6=шесть, 4=четыре, 3=три, 2=два, 1=один}
        System.out.println(tMap.tailMap(3)); // {3=три, 4=четыре, 6=шесть}
        System.out.println(tMap.headMap(3)); // {1=один, 2=два}
        System.out.println(tMap.lastEntry()); // 6=шесть
        System.out.println(tMap.firstEntry()); // 1=один
    }
}
