import java.util.ArrayList;
import java.util.List;

public class Bookshelf extends Book {
    private int capasityBookShelf;
    private int quantity;
    private List<Book> bookShelf = new ArrayList<>();
    boolean flag = true;
    
    public Bookshelf(int size, List<Book> list) {
        this.capasityBookShelf = size;
        this.bookShelf = list;
    }

    public Bookshelf(int size) {
        this.capasityBookShelf = size;
    }

    public void setBook(Book book) {
        if (bookShelf.size() < capasityBookShelf) {
            bookShelf.add(book);
            this.quantity++;
            System.out.printf("Вы положили книгу '%s', автора '%s' в шкаф.\n", book.getName(), book.getAutor());
        } else {
            System.out.println("Шкаф полный. Нет места для новой книги.");
        }
    }

    public void getBook(String nameBook) throws Exception{
        
        for (Book book : bookShelf) {
            if (book.getName().equals(nameBook)) {
                bookShelf.remove(book);
                this.quantity--;
                System.out.printf("Вы достали книгу '%s', автора '%s' из шкафа.\n", book.getName(), book.getAutor());
                flag = false;
            } 
        }
        throw new Exception("Книги с таким названием в шкафу нет");
    }

    @Override
    public String toString() {
        return bookShelf.toString();
    }

    public void lookShelfBooks() {
        System.out.println("В шкафу стоят следующие книги:");
        for (Book book : bookShelf) {
            System.out.printf("Книга: '%s', автор: '%s'\n", book.getName(), book.getAutor());
        }
    }

    public int getNumberBook(){
        return quantity;
    }
    
    public void findBook(String name) {
        boolean find = false;
        for (Book book : bookShelf) {
            if (book.getName().equals(name)) {
                find = true;
                System.out.printf("Книга %s есть в шкафу\n", book.getName());
            }
        }
        if (find == false) {
            System.out.printf("Книги %s нет в шкафу\n", name);
        }
    }
}
