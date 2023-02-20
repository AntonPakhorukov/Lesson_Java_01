public class Book {
    private String name;
    private String autor;

    public Book(String inputName, String inputAutor) {
        this.name = inputName;
        this.autor = inputAutor;
    }

    public Book() {
        this.name = "NoName";
        this.autor = "NoAutor";
    }

    public void setName(String inputName) {
        this.name = inputName;
    }

    public void setAutor(String inputAutor) {
        this.autor = inputAutor;
    }

    public String getName() {
        return name;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return String.format("Книга: '%s', автор: '%s'", name, autor);
    }
}
