package clase;
import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private List<Author> authorList = new ArrayList<>();
    private List<Element> elements = new ArrayList<>();
    public void addAuthor(Author author) {
        if (author != null) {
            authorList.add(author);
        }
    }

    public void addContent(Element element) {
        if (element != null) {
            elements.add(element);
        }
    }

    public void print() {
        System.out.println("Book Title: " + title);

        System.out.println("Authors:");
        for (Author author : authorList) {
            author.print();
        }

        System.out.println("Content:");
        for (Element element : elements) {
            element.print();
        }

    }
    public Book(String title) {
        this.title = title;
    }
}