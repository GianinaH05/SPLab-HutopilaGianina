package ro.uvt.clase;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Author> authorList = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    private List<BaseElement> elements = new ArrayList<>();
    public Book(){}
    public Book(String title) {
        this.title = title;
    }
    public void accept(Visitor vis){
        vis.visit(this);
        for(Element i : elements){
            i.accept(vis);
        }
    }
    public void addAuthor(Author author) {
        if (author != null) {
            authorList.add(author);
        }
    }

    public void addContent(BaseElement element) {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}