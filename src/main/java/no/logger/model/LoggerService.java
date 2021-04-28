package no.logger.model;


import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class LoggerService implements ILogger {

    private boolean initialized;
    private org.apache.logging.log4j.core.Logger log;

    @Autowired
    LevelService level;


    public LoggerService(){
        initialized = false;
    }

    @Override
    public void info(String message) {
        if (checkInitialized()){
            if (level.checkLevel(log, level.getLevelInfo())){
                log.info(message);
            }
        }

    }

    @Override
    public void debug() {
        if (checkInitialized()){

        }

    }

    @Override
    public void trace() {
        if (checkInitialized()){

        }

    }

    @Override
    public void warn() {
        if (checkInitialized()){

        }

    }

    @Override
    public void error() {
        if (checkInitialized()){

        }

    }

    @Override
    public void fatal() {
        if (checkInitialized()){

        }

    }

    public void setClass(Class c){
        this.log = (org.apache.logging.log4j.core.Logger) LogManager.getLogger(c);
        initialized = true;
    }

    private boolean checkInitialized(){
        return initialized;
    }
}
