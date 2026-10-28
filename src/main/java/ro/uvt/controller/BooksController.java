package ro.uvt.controller;

import org.springframework.web.bind.annotation.*;
import ro.uvt.clase.Book;
import ro.uvt.command.*;
import ro.uvt.services.BooksService;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {

    private final BooksService booksService;

    public BooksController(BooksService booksService) {
        this.booksService = booksService;
    }

    @GetMapping
    public List<Book> getBooks() {
        Command<List<Book>> command = new GetBooksCommand(booksService);
        return command.execute();
    }

    @GetMapping("/{id}")
    public Book getBooksId(@PathVariable int id) {
        Command<Book> command = new GetBookByIdCommand(booksService, id);
        return command.execute();
    }

    @PostMapping
    public Book postBook(@RequestBody Book book) {
        Command<Book> command = new CreateBookCommand(booksService, book);
        return command.execute();
    }

    @PutMapping("/{id}")
    public Book putBook(@PathVariable int id, @RequestBody Book book) {
        Command<Book> command = new UpdateBookCommand(booksService, id, book);
        return command.execute();
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable int id) {
        Command<Void> command = new DeleteBookCommand(booksService, id);
        command.execute();
    }
}
