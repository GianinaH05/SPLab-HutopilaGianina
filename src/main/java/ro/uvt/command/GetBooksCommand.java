package ro.uvt.command;

import ro.uvt.clase.Book;
import ro.uvt.services.BooksService;

import java.util.List;

public class GetBooksCommand implements Command<List<Book>> {
    private final BooksService booksService;

    public GetBooksCommand(BooksService booksService) {
        this.booksService = booksService;
    }

    @Override
    public List<Book> execute() {
        return booksService.getAllBooks();
    }
}