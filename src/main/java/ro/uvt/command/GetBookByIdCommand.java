package ro.uvt.command;

import ro.uvt.clase.Book;
import ro.uvt.services.BooksService;

public class GetBookByIdCommand implements Command<Book> {
    private final BooksService booksService;
    private final int id;

    public GetBookByIdCommand(BooksService booksService, int id) {
        this.booksService = booksService;
        this.id = id;
    }

    @Override
    public Book execute() {
        return booksService.getBookById(id);
    }
}
