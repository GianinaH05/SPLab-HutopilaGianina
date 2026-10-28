package ro.uvt.command;

import ro.uvt.clase.Book;
import ro.uvt.services.BooksService;

public class CreateBookCommand implements Command<Book> {
    private final BooksService booksService;
    private final Book book;

    public CreateBookCommand(BooksService booksService, Book book) {
        this.booksService = booksService;
        this.book = book;
    }

    @Override
    public Book execute() {
        return booksService.addBook(book);
    }
}