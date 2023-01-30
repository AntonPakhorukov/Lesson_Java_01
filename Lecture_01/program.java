// import java.util.List;
// import java.util.Scanner;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.io.FileReader;
// import java.io.BufferedReader;
public class program {
    // static void sayHi(){
    //     System.out.println("Hi");
    // }
    // static int sum(int a, int b){
    //     return a + b;
    // }
    // static double factor(int n){
    //     if (n == 1) return 1;
    //         return n * factor(n-1);
    // }
    public static void main(String[] args) throws Exception {
        
        // System.out.println("Bye world"); // Bye world
        // String s = "";
        // s = s + "123";
        // System.out.println(s); // 123
        
        // //ОБЪЯВЛЕНИЕ ПЕРЕМЕННЫХ======================================================================================
        
        // float f = 2.475f; // при float необходимо ставить "f" на конце знечения, так как нет неявного преобразования 
        // double d = 3.14; // тип double система использует автоматически
        // System.out.println(f); // 2.475
        // System.out.println(d); // 3.14
        
        // char ch = '1';
        // System.err.println(Character.isDigit(ch)); // true - так проверяется тип переменной
        // char sh = 'a';
        // System.out.println(Character.isDigit(sh)); // false
        // char test = 455; // можно положить только один символ
        // System.out.println(test); // Будет выдавать скорее символ по номеру кода
        
        // int a = 123;
        // double d = a; // можно переменной типа double присвоить значение переменной int, неявное преобразование
        // System.out.println(d);
        // // int x = d; // так присвоить переменной int значение переменной double нельзя, нет неявного преобразования        
        
        // // ЛОГИЧЕСКИЕ ВЫРАЖЕНИЯ======================================================================================
        
        // boolean f = true && false;
        // System.out.println(f); // согласно таблицы истинности - false
        // boolean d = 1234 <= 2456;
        // boolean dm = -1234 > 2;
        // System.out.println(d); // true
        // System.out.println(dm); // false
        // boolean test = d ^ dm;
        // System.out.println(test); //согласно таблице истинности - true
        // boolean test2 = 1 < 2 || d;
        // System.out.println(test2); // true
        
        // String msg = "Hello world";
        // System.out.println(msg);
        
        // var a = 123;
        // System.out.println(getType(a)); // Integer - метод getType написан отдельно
        
        // int x = 132;
        // System.out.println(Integer.toBinaryString(x)); // так можно перевести в бинарный код
        // int y = 132_000; // так можно писать для удобства
        // int sum = x + y;
        // System.out.println(sum);
        // // System.out.println(x.getClass().getSimpleName()); 
        // // - вызовет ошибку, так как getClass нельзя вызвать для примитивного класса
        // String str = "abc";
        // System.out.println(str.getClass().getSimpleName()); // можно вызвать, так как это ссылочный тип данных
        // var z = "test";
        // System.out.println(z.getClass().getSimpleName()); // String
        
        // // СТРОКИ====================================================================================================
        
        // String s = "qwerty";
        // char s1 = s.charAt(1); // так можно обращаться к символам в строках
        // System.out.println(s1);
        // System.out.println(s.charAt(4)); // так же можно и выводить символы строки
        
        // //ОПЕРАЦИИ В JAVA============================================================================================
        
        // int x = 10;
        // int y = 5;
        // int res = x-- + y++ - x - y + --y;
        // System.out.println(res); // 5
        
        // int a = 8;
        // System.err.println(Integer.toBinaryString(a)); // 1000
        // int b = a << 1; // операция побитового сдвига
        // System.out.println(b); // 16
        // System.err.println(Integer.toBinaryString(b)); // 10000 - бинарный код сдвинулся влево на один бит
        // System.out.println(b >> 2); // так можно взять корень числа

        // int x = 5;
        // int y = 2;
        // System.out.println(x | y); // ответ будет 7, так как | - это побитовая "и" (коньюнкция)
        // // 5 = 101
        // // 2 = 010
        // // 7 = 111
        // System.out.println(x & y); // ответ будет 0, так как & - это побитовая или (дизюнкция) 
        // // 5 = 101
        // // 2 = 010
        // // 0 = 000
        // System.out.println(x ^ y); // ответ будет 7, так как ^ - это побитовая разделительная "или" (разд-я дизюнкция) 
        // // 5 = 101
        // // 2 = 010
        // // 0 = 111
        
        // // МОГУТ БЫТЬ ПРОБЛЕМЫ:

        // boolean a1 = true;
        // boolean b1 = true;
        // System.out.println(a1 && b1); // с && - быстрая операция, смотрит на левую часть, и не смотрит что справа 
        // System.err.println(a1 & b1);

        // String text = "qwe1"; // 4 символа, индекс 0..3
        // //boolean bol = text.length() >= 5 && text.charAt(4) == '1'; // ошибки не выдаст, смотрит только левую часть
        // //System.out.println(bol);
        // String text1 = "qwe1"; // 4 символа, индекс 0..3
        // boolean bol1 = text1.length() >= 5 & text1.charAt(4) == '1'; // выдаст ошибку, так как смотрит обе стороны
        // System.out.println(bol1);
        
        // // МАССИВЫ===================================================================================================
        
        // int[] array = new int[10];
        // System.out.println(array.length); // 10
        // int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // System.out.println(arr.length); // 9
        // System.out.println(arr[2]);
        // arr[2] = 30;
        // System.out.println(arr[2]);

        // int[] array2[] = new int[3][5]; // 3 строки и 5 столбцов
        // for (int[] line : array2) {
        //     for (int item : line) {
        //         System.out.printf("%d ", item);
        //     }
        //     System.out.println();
        // }

        // int[] test[] = new int[4][4];
        // for(int i = 0; i < test.length; i++) {
        //     for(int j = 0; j < test[i].length; j++) {
        //         System.out.printf("%d ", test[i][j]);
        //     }
        //     System.out.println();
        // }
        
        // int[][] ar = new int[3][3];
        // for(int[] line : ar) {
        //     for(int item : line) {
        //     System.out.printf("%d ", item);
        //     }
        //     System.out.println();
        // }
        
        // // ПРЕОБРАЗОВАНИЯ============================================================================================
        
        // double d = 3.14; int i = 5;
        // System.out.println(d);
        // System.out.println(i);
        // int x = (int)d; // Преобразуем в int из double
        // System.out.println(x); // выведет целую часть
        // double di = i; // принудительного преобразования не нужно
        // System.out.println(di);
        // byte b = 123;
        // System.out.println(b);
        // //b = 1234; выдаст ошибку конвертации int в byte
        // b = Byte.parseByte("1234"); // выдаст ошибку, размер больше возможного значения, конвертировать нельзя 
        // System.out.println(b);
        
        // // ПОЛУЧЕНИЕ ДАННЫХ ИЗ ТЕРМИНАЛА=============================================================================

        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("Введите ваше имя: ");
        // String name = iScanner.nextLine();
        // System.out.printf("Здравствуй, %s!\n", name);
        // System.out.printf("Введите целое число: ");
        // int a = iScanner.nextInt();
        // System.out.printf("Вы ввели %d\n", a);
        // System.out.printf("Введите вещественное число: ");
        // double d = iScanner.nextDouble();
        // System.out.printf("Вы ввели %.2f\n", d);
        // iScanner.close();
        // System.out.printf("%d + %.2f = %.2f\n", a, d, a + d);
        // System.out.printf("Введите целое число: ");
        // boolean flag = iScanner.hasNextInt(); // так можно проверять ввод
        // System.out.println(flag);
        // int z = iScanner.nextInt();
        // System.out.println(z);
        
        // // ФОРМАТИВНЫЙ ВЫВОД=========================================================================================
        
        // int a = 5;
        // int b = 6;
        // int c = a + b;
        // System.out.printf("%d + %d = %d \n", a, b, c);
        // String s = String.format("%d + %d = %d \n", a, b, c);
        // System.out.println(s);
        
        // // ВИДЫ СПЕЦИФИКАТОРОВ=======================================================================================
               
        // // %d - целочисленные
        // // %x - шестнадцатиричные
        // // %f - с плавающей точкой
        // // %e - вывод в экспоненциальной форме 3.1514е+01
        // // %c - вывод символов
        // // %s - вывод строковых занчений    
        
        // // ФУНКЦИИ И МЕТОДЫ==========================================================================================
        
        // sayHi();
        // System.err.println(sum(5, 8));
        // System.out.println(factor(5));
        
        // // Управляющие конструкции===================================================================================
        
        // // Оператор ветвления "if"
        // int a = 3;
        // int b = 2;
        // int c;
        // if (a > b){
        // c = a;
        // } else {
        // c = b;
        // }
        // System.out.println(c);
        // if (a > b) c = a;
        // if (b > a) c = b;
        // System.out.println(c);
        // c = a > b ? a : b; //Если верно, то вернется все что от знака "?" до ":", в обратном случае то, что после ":"
        // System.out.println(c);
        // // Оператор выбора "Switch"
        // Scanner scan = new Scanner(System.in);
        // System.out.printf("Введите месяц: ");
        // boolean flag = scan.hasNextInt();
        // System.out.printf("В строке ввода %s\n", flag);
        // int mounth = scan.nextInt();
        // String text = "";
        // switch (mounth) {
        //     case 1:
        //         text = "Autumn";
        //         break;
        //     case 2:
        //         text = "February";
        //         break;
        //     case 3: // если default нет, то при вводе 3 или 4 или 5 будет выводится "345"
        //     case 4:
        //     case 5:
        //         text = "345";
        //     default: // если есть dfefault, то при вводе 3 ил 4 или 5 будет выводится ошибка
        //         text = "mistake";
        //         break;
        // }
        // scan.close();
        // System.out.println(text);
        // // ЦИКЛЫ
        // // WHILE
        // int value = 321;
        // int count = 0;
        // while (value != 0) {
        //     value /= 10;
        //     count++;
        // }
        // System.out.println(count);
        // // do While
        // int value1 = 321;
        // int count1 = 0;
        // do {
        //     value1 /= 10;
        //     count1++;
        // } while (value1 != 0);
        // System.out.println(count1);
        // // Continue, Break
        // for(int i = 0; i < 10; i++){
        //     if (i % 2 == 0)
        //         continue; // Перейдет на следующую итерацию
        //     System.out.println(i); //1,3,5,7,9
        // }
        // for (int j = 0 ; j < 10; j++) {
        //     if (j == 7) 
        //         break; // Прервет выполнение на данной итерации
        //     System.out.println(j); // 0,1,2,3,4,5,6
        // }
        // // FOR
        // for (int i = 0; i < 4; i++) {
        //     for (int j = 0; j < 4; j++) {
        //         System.out.printf("*" + " ");
        //     }
        //     System.out.println();
        // }
        // //FOR EACH (FOR IN)
        // int array[] = new int[5];
        // for(int item : array) {
        //     System.out.printf("%d ", item);
        // }
        // System.out.println();
        // //int[] arr[] = new int[3][5];
        // int[] arr[] = new int[][] {{1,2,3}, {1,2,3}, {1,2,3}};
        // for(int[] item : arr) {
        //     for(int line : item) {
        //         System.out.printf("%d ", line);
        //     } System.out.println();
        // } 
        // //=========ВАЖНАЯ ОСОБЕННОСТЬ=============
        // int[] arr = new int[10];
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = 3;
        // }
        // for (int j = 0; j < arr.length; j++) {
        //     System.out.printf("%d ", arr[j]); // 3 3 3 3 3 3 3 3 3 3 - присвоит значения "3"
        // } System.out.println();
        // for (int item : arr) {
        //     item = 5;
        //     System.out.printf("%d ", item); // 5 5 5 5 5 5 5 5 5 5 - будет только в рамках этого цикла
        // }
        // System.out.println();
        // for (int k = 0; k < arr.length; k++) {
        //     System.out.printf("%d ", arr[k]); // 3 3 3 3 3 3 3 3 3 3 - останется "3"
        // }
        
        // // РАБОТА С ФАЙЛОМИ==========================================================================================
        // // ЗАПИСЬ
        
        // try (FileWriter fw = new FileWriter("file.txt", false)){ // Если файла нет, то он создастся
        //     fw.write("Line 1"); // Запишет на первую строку
        //     fw.append('\n'); // перейдет на вторую строку
        //     fw.append('2'); // напишет 2 на второй строке
        //     fw.append('\n'); // перейдет на новую строку
        //     fw.append("Line 3"); // напишет на третьей строке
        //     fw.write("new"); // слитно допишет в 3-ю строку
        //     fw.append("AndNew"); // так же прилипнет в третьей строке
        //     fw.flush(); // записывает то, что уже передал с помощью метода write
        // } catch (Exception ex) {
        //     System.out.println(ex.getMessage());
        // }
        // //ЧТЕНИЕ
        // FileReader fr = new FileReader("file.txt");
        // int c;
        // while((c = fr.read()) != -1) {
        //     char ch = (char)c;
        //     if (ch == '\n') {
        //         System.out.printf("\n");
        //     } else {
        //         System.out.printf("%s", ch);
        //     }
        // }
        // System.out.println("\n");
        // fr.close();
        // BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        // String str;
        // while((str = br.readLine()) != null){
        //     System.out.printf("== %s ==\n", str);
        // }
        // br.close();


     }
    // static String getType(Object a) {
    //     return a.getClass().getSimpleName();
        
    // }
}
