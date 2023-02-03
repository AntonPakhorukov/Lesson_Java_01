package Lecture_02;

import java.io.Console;
import java.io.File;
import java.io.IOException;

import java.lang.System.Logger;
import java.util.logging.*;

public class Lesson_02 {
    public static void main(String[] args) throws IOException{
        // excample_01();

        // API ==========================================================================================================
        /*
        concat(): объединение строк 
        valueOf(): преобразует Object в строковое представление (завязан на toString()) 
        join(): объединяет набор строк в одну с учетом разделителя 
        charAt(): получение символа по индексу 
        indexOf(): первый индекс вхождения подстроки 
        lastIndexOf(): последний индекс вхождения подстроки 
        startsWith()/endsWith(): определяет, начинается/заканчивается ли строка с подстроки 
        replace(): замена одной подстроки на другую
        trim(): удаляет начальные и конечные пробелы 
        substring(): возвращает подстроку, см.аргументы 
        toLowerCase()/toUpperCase(): возвращает новую строку в нижнем/верхнем регистре 
        сompareTo(): сравнивает две строки 
        equals(): сравнивает строки с учетом регистра 
        equalsIgnoreCase(): сравнивает строки без учета регистра 
        regionMatches(): сравнивает подстроки в строках
        */
        // Работа с файловой системой ===================================================================================
        
        // File<имя> = new File(<полный путь к файлу>)
        // File f1 = new File("file.txt"); // относительный путь к файлу
        // File f2 = new File("/Geek_Brains_2022/Java/Work_Java/Lecture_02/Lesson_02.java"); // абсолютный путь к файлу
        // String pathProject = System.getProperty("user.dir"); // System.dir
        // String pathFile = pathProject.concat("/file.txt");
        // File f3 = new File(pathFile);
        
        // System.out.println(f3.getAbsolutePath());

        // Обработка ошибок =============================================================================================
        /*
        try {
            код, у котором может появиться ошибка
        } catch (Exception e) {
            Обработка, если ошибка произойдет
        } finally {
            код, который выполнится в любом случае
        }
        */

        // try {
        //     String pathProject = System.getProperty("user.dir"); 
        //     // указываем путь к папке, откуда запускается файл
        //     String pathFile = pathProject.concat("/file2.txt"); 
        //     // указываем конкретный файл в папке
        //     File f3 = new File(pathFile); 
        //     // создаем файл и связь по пути с файлом
        //     System.out.println("try"); // выполнен блок try
        //     if (f3.createNewFile()) {
        //         System.out.println("Create new file"); // создан новый файл
        //     } else {
        //         System.out.println("Existed file"); // файл существует
        //     }
        // } catch (Exception e) {
        //     System.out.println("catch");
        // } finally {
        //     System.out.println("finally");
        // }

        // Работа с файлами API =====================================================================================
        /*
        isHidden(): возвращает истину, если каталог или файл является скрытым 
        length(): возвращает размер файла в байтах 
        lastModified(): возвращает время последнего изменения файла или каталога 
        list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге 
        listFiles(): возвращает массив файлов и подкаталогов, которые находятся в определенном каталоге 
        mkdir(): создает новый каталог 
        renameTo(File dest): переименовывает файл или каталог
        */

        // Логирование ==============================================================================================

        // использование: ======================
        //Logger logger = Logger.getLogger();
        // уровни важности: ====================
        // INFO, DEBUG, ERROR, WARNING и др.
        // вывод ===============================
        // ConsoleHandler info = new ConsoleHandler();
        // log.addHandler(info);
        // формат вывода: ======================
        // XMLFormatter, SampleFormatter

        // ЛОГИРОВАНИЕ В КОНСОЛЬ ====================================================================================
        //logger.setLevel(Level.INFO); 
        // java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Lesson_02.class.getName());   
        // // создаем логирование и указываем в аргументы, для какого класса делаем логирование   
        // ConsoleHandler ch = new ConsoleHandler();   
        // // создаем обработчик, выбираем, куда будут выводится ошибки - в данном случае это console    
        // logger.addHandler(ch); 
        // // после создания обработчика, мы должны его указать логгеру - для того, чтобы было понятно куда отправлять
        // SimpleFormatter sFormat = new SimpleFormatter();   //либо это формат 
        // //XMLFormatter xml = new XMLFormatter(); // формат 1
        // ch.setFormatter(sFormat); //либо это формат 2
        // //ch.setFormatter(xml); // формат 1
        // logger.log(Level.WARNING, "Тестовое логирование");       
        // logger.info("Тестовое логирование 2");
        
        // ЛОГИРОВАНИЕ В ФАЙЛ =======================================================================================        
        java.util.logging.Logger log = java.util.logging.Logger.getLogger(Lesson_02.class.getName());
        // Создали переменную  типа Logger, указываем имя класса, для которого добавляем логирование
        FileHandler fh = new FileHandler("log.xml");
        // Создаем Handler - то, куда ошибки будут выпадать 
        log.addHandler(fh);
        // после создания Hendler, мы должны его указать в качестве аргумента нашему Logger'у для того,
        // чтобы было понятно, куда сообщения отправлять
        XMLFormatter xml = new XMLFormatter(); // создаем(описываем) тот формат, 
        //в рамках которого будет производится запись или вывод этих сообщений
        //SimpleFormatter versus2 = new SimpleFormatter(); // другой вариант формата
        fh.setFormatter(xml); // в какой формат поступают ошибки
        //fh.setFormatter(versus2); 
        log.log(Level.WARNING, "Warning"); // позволяет указать уровень сообщений и то сообщение, которое требуется показать
        log.info("info");
        fh.close();
    }
    // static void excample_01() {
    //     String str = ""; 
    //     var s1 = System.currentTimeMillis();
    //     for (int i = 0; i < 1_000_000; i++) {  // ≈41000 ms (149249)
    //         str += "+"; 
    //     } // Скорость выполнения алгоритма ≈41000 ms
    //     System.out.println(System.currentTimeMillis() - s1);

    //     StringBuilder sb = new StringBuilder(); 
    //     var s2 = System.currentTimeMillis();
    //     for (int i = 0; i < 1_000_000; i++) {
    //         sb.append("+"); 
    //     } // Скорость выполнения алгоритма ≈9 ms (14)
    //     System.out.println(System.currentTimeMillis() - s2);
    // }
}
