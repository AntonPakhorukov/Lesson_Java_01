public class MainBookShelf {
    public static void main(String[] args) throws Exception {
        Book b1 = new Book("Властелин колец", "Джон Р. Р. Толкин");
        Book b2 = new Book("Гарри Поттер", "Джоан Роулинг");
        Book b3 = new Book("Война и мир", "Лев Толстой");
        Book b4 = new Book("Алиса в Стране чудес", "Льюис Кэрролл");
        Book b5 = new Book("Дюна", "Фрэнк Герберт");
        Book b6 = new Book("Великий Гэтсби", "Фрэнсис Скотт Фицджеральд");
        
        Bookshelf bookshelf = new Bookshelf(5);
        
        bookshelf.setBook(b1);
        bookshelf.setBook(b2);
        bookshelf.setBook(b3);
        bookshelf.setBook(b4);
        bookshelf.setBook(b5);
        System.out.println();
        System.out.println("Количество книг в шкафу = " + bookshelf.getNumberBook());
        bookshelf.lookShelfBooks();
        System.out.println();
        try {
            bookshelf.getBook("Гарри Поттер");
        } catch (Exception e) {
            if (bookshelf.flag == true) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        System.out.println("Количество книг в шкафу = " + bookshelf.getNumberBook());
        bookshelf.lookShelfBooks();
        bookshelf.setBook(b6);
        System.out.println();
        System.out.println("Количество книг в шкафу = " + bookshelf.getNumberBook());
        bookshelf.lookShelfBooks();
        System.out.println();
        bookshelf.findBook("Генри Портной");
        bookshelf.findBook("Дюна");
    }
}
