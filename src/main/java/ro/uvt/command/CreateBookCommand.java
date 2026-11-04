package ro.uvt.command;

import ro.uvt.clase.Book;
import ro.uvt.presistance.BooksRepository;
import ro.uvt.services.BooksService;

public class CreateBookCommand implements Command<Book> {
    private final CommandContext context;
    private final Book book;

    public CreateBookCommand(CommandContext context, Book book) {
        this.context = context;
        this.book = book;

    }

    @Override
    public Book execute() {
        BooksRepository repository = context.getBooksRepository();
        return repository.save(book);
    }
}