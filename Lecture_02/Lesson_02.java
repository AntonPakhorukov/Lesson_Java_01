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
        // String pathProject = System.getProperty("user.dir");
        // String pathFile = pathProject.concat("/file.txt");
        // File f3 = new File(pathFile);
        
        // System.out.println(f3.getAbsolutePath());

        // Обработка ошибок =============================================================================================
        /*
        try {
            код, у котором может появиться ошибка
        } catch (Exception e) {
            Обраюотка, если ошибка произойдет
        } finally {
            код, который выполнится в любом случае
        }
        */

        try {
            String pathProject = System.getProperty("user.dir"); // указываем путь к папке, откуда запускается файл
            String pathFile = pathProject.concat("/file.txt"); // указываем конкретный файл
            File f3 = new File(pathFile); // создаем файл и связь по пути с файлом
            // System.out.println("try");
            if (f3.createNewFile()) {
                System.out.println("Create new file");
            } else {
                System.out.println("Existed file");
            }
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }

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
        /*java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Lesson_02.class.getName());      
        ConsoleHandler ch = new ConsoleHandler();       
        logger.addHandler(ch); 
        SimpleFormatter sFormat = new SimpleFormatter();   //либо это формат 
        //XMLFormatter xml = new XMLFormatter(); // формат 1
        ch.setFormatter(sFormat); //либо это формат 2
        //ch.setFormatter(xml); // формат 1
        logger.log(Level.WARNING, "Тестовое логирование");       
        logger.info("Тестовое логирование 2");*/
        // ЛОГИРОВАНИЕ В ФАЙЛ =======================================================================================
        java.util.logging.Logger log = java.util.logging.Logger.getLogger(Lesson_02.class.getName());
        FileHandler fh = new FileHandler("log.xml");
        log.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        log.log(Level.WARNING, "Warning");
        log.info("info");
    }
    static void excample_01() {
        String str = ""; 
        var s1 = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {  // ≈41000 ms (149249)
            str += "+"; 
        } // ≈41000 ms
        System.out.println(System.currentTimeMillis() - s1);

        StringBuilder sb = new StringBuilder(); 
        var s2 = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            sb.append("+"); 
        } //  ≈9 ms (14)
        System.out.println(System.currentTimeMillis() - s2);
    }
}
