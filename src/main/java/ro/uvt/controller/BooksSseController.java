package ro.uvt.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;
import ro.uvt.clase.Book;
import ro.uvt.observer.AllBooksSubject;
import ro.uvt.observer.SseObserver;

@RestController
public class BooksSseController {

    private final AllBooksSubject allBooksSubject;

    public BooksSseController(AllBooksSubject allBooksSubject) {
        this.allBooksSubject = allBooksSubject;
    }

    @CrossOrigin(origins = "*")
    @GetMapping(value = "/books-sse", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public ResponseBodyEmitter getBooksSse() {
        final SseEmitter emitter = new SseEmitter(0L);
        SseObserver observer = new SseObserver(emitter);
        allBooksSubject.attach(observer);
        Book hardcodedBook = new Book("Sabloane de proiectare");
        observer.update(hardcodedBook);

        observer.update(hardcodedBook);
        emitter.onCompletion(() -> allBooksSubject.detach(observer));
        emitter.onTimeout(() -> allBooksSubject.detach(observer));
        emitter.onError((ex) -> allBooksSubject.detach(observer));
        return emitter;
    }
}