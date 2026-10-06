import clase.*;
public class Main {
    public static void main(String[] args) {
        Author a = new Author("A","A");
        Book b = new Book("AA");
        b.addAuthor(a);
        b.print();
    }
}