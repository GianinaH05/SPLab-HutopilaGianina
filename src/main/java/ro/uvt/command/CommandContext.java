package ro.uvt.command;

import org.springframework.stereotype.Component;
import ro.uvt.presistance.BooksRepository;

@Component
public class CommandContext {

    private final BooksRepository booksRepository;

    public CommandContext(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    public BooksRepository getBooksRepository() {
        return booksRepository;
    }
}