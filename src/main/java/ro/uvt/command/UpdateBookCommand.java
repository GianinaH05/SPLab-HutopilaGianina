package ro.uvt.command;

import ro.uvt.clase.Book;
import ro.uvt.presistance.BooksRepository;
import ro.uvt.services.BooksService;

public class UpdateBookCommand implements Command<Book> {
    private final CommandContext context;
    private final int id;
    private final Book book;

    public UpdateBookCommand(CommandContext context, int id, Book book) {
        this.context = context;
        this.id = id;
        this.book = book;
    }

    @Override
    public Book execute() {
        BooksRepository repository = context.getBooksRepository();
        book.setId((long) id);
        return repository.save(book);
    }
}