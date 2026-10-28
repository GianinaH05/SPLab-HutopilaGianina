package ro.uvt.command;

public interface Command<R> {
    R execute();
}