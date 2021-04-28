package no.logger.model;

public interface ILogger {

    void info(String message);
    void debug();
    void trace();
    void warn();
    void error();
    void fatal();
}
