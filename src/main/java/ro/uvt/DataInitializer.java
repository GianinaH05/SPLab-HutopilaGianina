package ro.uvt;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ro.uvt.clase.*;
import ro.uvt.presistance.BooksRepository;

@Component
public class DataInitializer implements CommandLineRunner {

    private final BooksRepository booksRepository;

    public DataInitializer(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Book book = new Book("Design Patterns in Java");

        Author author = new Author("Erich", "Gamma");
        book.addAuthor(author);
        Section section1 = new Section("Chapter 1: Introduction");
        Paragraph p1 = new Paragraph("This chapter covers basic object-oriented principles.");
        section1.add(p1);

        Paragraph p2 = new Paragraph("Command Pattern encapsulates a request as an object.");

        book.addContent(section1);
        book.addContent(p2);

        booksRepository.save(book);

        System.out.println(">>> Hardcoded book successfully saved to H2 database! ID: " + book.getId());
    }
}