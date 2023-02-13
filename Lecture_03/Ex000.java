package Lecture_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

import javax.naming.ldap.ControlFactory;

public class Ex000 {
   public static void main(String[] args) {
      // Object o = 1;
      // System.out.println(o.getClass().getName()); // java.lang.Integer
      // o = 1.2;
      // System.out.println(o.getClass().getName()); // java.lang.Double

      // Object value = 1;
      // System.out.println(value.getClass().getName()); // java.lang.Integer
      // value += "str";
      // System.out.println(value); // 1str 
      // System.out.println(value.getClass().getName()); // java.lang.String

      // System.out.println(sum(1, 2));
      // System.out.println(sum(1.2, 2));
      // System.out.println(sum(1, 2.4));
      // System.out.println(sum(1.2, 2.3));
      // System.out.println(sum("1.2", "2.3"));

      ArrayList<Integer> list = new ArrayList<>(10);
      for (int i = 0; i < 10; i++) {
         list.add(i);
      }
      System.out.println(list); //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
      /*
      list.add(3, 33); // добавляет элемент со сдвигом, нельзя из 10 позиций добавить 11-ю
      System.out.println(list); // [0, 1, 2, 33, 3, 4, 5, 6, 7, 8, 9]
      list.remove(3);
      System.out.println(list); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
      list.set(9, 99); // просто меняет значение 
      System.out.println(list); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 99]
      System.out.println(list.get(3)); // 3
      System.out.println(list.subList(2, 5)); //[2, 3, 4] - выведет элементы от/до заданного индекса, включая первый 
      */

      // list.clear(); // очистит список
      // System.out.println(list); // []
      
      // String s = list.toString();
      // System.out.println(s); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
      // System.out.println(s.getClass().getName()); // java.lang.String

      ArrayList<Integer> list1 = new ArrayList<>();
      for (int i = 0; i < 6; i++) {
         list1.add(i, i * 2);
      }
      // System.out.println(list1); // [0, 2, 4, 6, 8, 10]
      // System.out.println(list.containsAll(list1)); // false, проверяет, все элементы в list есть из list1
      // list1.remove(5); // удалили последний элемент
      // System.out.println(list.containsAll(list1)); // true
      
      // list.removeAll(list1); // удалит элементы в list те, что есть в list1
      // System.out.println(list); // [1, 3, 5, 7, 9]
      // list.retainAll(list1); // оставит в list только те элементы, что есть в list1
      // System.out.println(list); // [0, 2, 4, 6, 8]

      // System.out.println(list1.getClass().getSimpleName()); // ArrayList
      // Object[] ob = list1.toArray();
      // System.out.println(Arrays.toString(ob)); // [0, 2, 4, 6, 8]
      // System.out.println(ob[2]); // 4 
      // System.out.println(ob.getClass().getSimpleName()); // Object[]

      // int[] ar = {1, 2, 3};
      // System.out.println(ar.getClass().getSimpleName()); // int[]
      // List<int[]> list2 = Arrays.asList(ar);
      // System.out.println(list2.getClass().getSimpleName()); // ArrayList
      // for (int[] is : list2) {
      //    System.out.println(Arrays.toString(is)); //[1, 2, 3]
      // }

      // List<Integer> list3 = List.copyOf(list); // сделает копию list
      // System.out.println(list3); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
      List<Integer> list4 = List.of(0, 2, 4, 6); // запишет элементы из list под индексами
      System.out.println(list4); // [0, 2, 4, 6]
      // list4.set(0, 6); // выдаст ошибку, так как создан не изменяемый список
      // list4.add(0, 6); // выдаст ошибку, так как создан не изменяемый список
      System.out.println(list4);

   }
   static Object sum(Object a, Object b) {
      if (a instanceof Integer && b instanceof Integer) { // instanceof - является
         return (Object) ((Integer) a + (Integer) b);
      } else if (a instanceof Double && b instanceof Double) {
         return (Object) ((double) a + (double) b); 
      } else if (a instanceof Double && b instanceof Integer) {
         return (Object) ((Double) a + (Integer) b);
      } else if (a instanceof Integer && b instanceof Double) {
         return (Object) ((Integer) a + (Double) b);
      } else if (a instanceof String && b instanceof String) {
         // return (Object) ((String) a + (String) b); // 1.22.3
         // return String.join(" ", a.toString(), b.toString()); // 1.2 2.3
         return String.join(" ", (String) a, (String) b); // 1.2 2.3
         // return a.toString().concat(b.toString()); // 1.22.3
      } else {
         return 0;
      }
   }
}