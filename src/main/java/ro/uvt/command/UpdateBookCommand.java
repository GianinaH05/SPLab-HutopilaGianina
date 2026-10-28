package ro.uvt.command;

import ro.uvt.clase.Book;
import ro.uvt.services.BooksService;

public class UpdateBookCommand implements Command<Book> {
    private final BooksService booksService;
    private final int id;
    private final Book book;

    public UpdateBookCommand(BooksService booksService, int id, Book book) {
        this.booksService = booksService;
        this.id = id;
        this.book = book;
    }

    @Override
    public Book execute() {
        return booksService.updateBook(id, book);
    }
}