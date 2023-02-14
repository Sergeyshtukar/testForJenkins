package tools.logging;

import java.util.logging.Logger;

public class MyLogger {

    private static final Logger logger = Logger.getLogger(MyLogger.class.getName());

    public void info(String message) {
        logger.info(message);
    }
}
