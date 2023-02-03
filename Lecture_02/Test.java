package Lecture_02;

public class Test {
    public static void main(String[] args) {
        String str = "Hello world";
        String str2 = "Hi people";
        String str3 = "Hello world my friends";
        String str4 = "hello world my friends";
        String res = "";

        // res = str.concat(str2); // Hello worldHi people - объединит строки
        
        // res = String.join(" ", str, str2); // Hello world Hi people - объединит обе строки
        
        // int num = 125;
        // res = String.valueOf(num); // Через обертку класса String переведет int в string
        
        // char symb = str.charAt(0); // Выведет H - нулевой символ

        // int num = 0;
        // num = str.indexOf("l"); // Выведет первый индекс символа - 2, под которым находится "l"
        // num = str.lastIndexOf("l"); // Выведет последний индекс символа - 9, под которым находится "l"

        // boolean start = str.startsWith("w"); // true - показывает, начинается ли строка с "H"
        // boolean finish = str2.endsWith("d"); // false - показывает, заканчивается строка символом "d"
        
        // res = str.replace("H", "h"); // hello world - заменит "H" на "h", меняет символы (можно удалять из строк)

        // String str3 = " Удаляет пробелы в начале и конце ";
        // str3 = str3.trim(); // Удаляет пробелы в начале и конце строки

        // res = str.substring(5, 11); // с 6 по 10 выведет = world
        // res = str.substring(5); // Выведет все с 6 символа и доконца = world

        // res = str.toLowerCase(); // hello world - все с маленького регистра
        // res = str2.toUpperCase(); // HI PEOPLE - все с большого регистра

        // String s1 = "Hello";
        // String s2 = "Hi";
        // String s3 = s1;
        // String s4 = s1.toUpperCase();
        // int value = s1.compareTo(s2); 
        // // -4, значение меньше 0, если эта строка лексикографически меньше строкового аргумента
        // int val = s1.compareTo(s3); // 0
        // int val3 = s1.compareTo(s4); // 32 - реагирует на регистр    
        // // 0, значение 0, если строка аргумента равна этой строке;
        // int val2 = s2.compareTo(s1);
        // // 4, и значение больше 0, если эта строка лексикографически больше строкового аргумента.
        // int value = s1.compareToIgnoreCase(s2); // -4
        // int val2 = s1.compareToIgnoreCase(s3); // 0
        // int val5 = s1.compareToIgnoreCase(s4); // 0
        // int val2 = s2.compareToIgnoreCase(s1); // 4

        // boolean value = str.equals(str2); // false - сравнивает строки

        boolean value = str.regionMatches(0, str3, 0, 5); // true
        // Сравнивает текущую строку с индекса 0 со второй строкой от индекса 0 до индекса 5 с учетом регистра
        boolean val = str.regionMatches(true, 0, str4, 0, 5);
        // Сравнивает текущую строку с индекса 0 со второй строкой от индекса 0 до индекса 5 без учета регистра
        System.out.println(value);
        System.out.println(val);

        
        


    }
}
