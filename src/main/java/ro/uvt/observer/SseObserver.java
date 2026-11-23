package ro.uvt.observer;

import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;
import java.io.IOException;

public class SseObserver implements Observer {

    private final SseEmitter emitter;

    public SseObserver(SseEmitter emitter) {
        this.emitter = emitter;
    }

    @Override
    public void update(Object event) {
        try {
            emitter.send(SseEmitter.event()
                    .name("book-event")
                    .data(event));
        } catch (IOException e) {
            emitter.completeWithError(e);
        }
    }
}