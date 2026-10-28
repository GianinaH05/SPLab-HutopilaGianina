package ro.uvt.services;

import org.springframework.stereotype.Service;
import ro.uvt.clase.Book;
import java.util.List;

@Service
public class BooksService {
    public List<Book> getAllBooks() {
        // Implementation logic
        return List.of();
    }

    public Book getBookById(int id) {
        // Implementation logic
        return null;
    }

    public Book addBook(Book book) {
        // Implementation logic
        return book;
    }

    public Book updateBook(int id, Book book) {
        // Implementation logic
        return book;
    }

    public void deleteBook(int id) {
        // Implementation logic
    }
}