package Seminar_03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Seminar_03 {
    public static void main(String[] args) {
        // task_01();
        // task_02(10);
        // task_03();
        // task_04();

         
    }
    static void task_01() {
        /* Задача 1:
         Даны следующие строки, cравнить их с помощью == и метода equals() класса Object
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
         */
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
        System.out.println(s1 == s2); // Будет true, так как s2 не будет создана, а будет ссылка на тот же адрес s1
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s3); // true
        System.out.println(s1==s4); // true
        System.out.println(s1.equals(s4)); // true
        // "==" проверяет адрес, equals проверяет значение, тип
        System.out.println(s1 == s5); // false
        System.out.println(s1.equals(s5)); // true
        System.out.println(s1 == s6); // false
        System.out.println(s1.equals(s6)); // true

    }
    
    static void task_02(int n) {
        /* Задача 2
         Заполнить список десятью случайными числами. 
        Отсортировать список методом sort() и вывести его на экран.
        */
        Random rand = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(rand.nextInt(100));
        }
        System.out.println(list); // [28, 83, 25, 79, 86, 12, 63, 71, 47, 96]
        Collections.sort(list); // Сортируем лист через Коллекцию (родителя)
        System.out.println(list); // [12, 25, 28, 47, 63, 71, 79, 83, 86, 96]
        Collections.reverse(list); // так же через более высокий класс можно сортировать
        System.out.println(list); //[96, 86, 83, 79, 71, 63, 47, 28, 25, 12]
    }
    
    static void task_03() {
        /* Задача 3
        Создать список типа ArrayList
        Поместить в него как строки, так и целые числа. 
        Пройти по списку, найти и удалить целые числа.
        */
        List list = new ArrayList<>();

        list.add(55);
        list.add("Привет");
        list.add("44");
        list.add(777);
        list.add("Пока");

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Integer) { // instanceof - случай, если найдет Integer (== не сработает)
                list.remove(i);
                i--; // Используем декримент, так как при удалении значения индексы сдвинуться
            }
        }
        System.out.println(list);
    }

    static void task_04() {
        /* Задача 4
        Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так, 
        что на 0й позиции каждого внутреннего списка содержится название жанра, 
        а на остальных позициях - названия книг. Напишите метод для заполнения данной структуры.
        */
        List<List<String>> list = new ArrayList<>();
        addBook(list, "Детектив", "Шерлок Холмс");
        addBook(list, "Детектив", "Эркюль Пуаро");
        addBook(list, "Роман", "Война и мир");
        addBook(list, "Фентази", "Гарри Поттер");
        
        System.out.println(list);
    }
    static void addBook(List<List<String>> list, String genere, String bookName) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).get(0).equals(genere)) {
                list.get(i).add(bookName);
                return;
            }
        }
        List<String> list1 = new ArrayList<>();
        list1.add(genere);
        list1.add(bookName);
        list.add(list1);
    }
}
