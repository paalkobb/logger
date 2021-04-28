package no.logger.model;

import org.apache.logging.log4j.core.Logger;

public interface ILevelService {

    boolean checkLevel(Logger logLevel, String level);

}
