package no.logger.model;

import org.apache.logging.log4j.core.Logger;
import org.springframework.stereotype.Component;

@Component
public class LevelService implements ILevelService {

    private String info = "INFO";
    private String debug = "DEBUG";
    private String trace = "TRACE";
    private String warning = "WARNING";
    private String error = "ERROR";



    @Override
    public boolean checkLevel(Logger log, String level){
        return false;
    }

    public String getLevelInfo(){
        return info;
    }

}
