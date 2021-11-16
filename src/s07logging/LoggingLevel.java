package s07logging;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingLevel {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(LoggingLevel.class.getName());

//        logger.setLevel(Level.SEVERE);
//        logger.setUseParentHandlers(false);
//        ConsoleHandler consoleHandler = new ConsoleHandler();
//        consoleHandler.setLevel(Level.ALL);
//        logger.addHandler(consoleHandler);

        logger.log(Level.SEVERE, "A severe message!");
        logger.log(Level.WARNING, "A warning message!");
        logger.log(Level.INFO, "A info message!");
        logger.log(Level.CONFIG, "A config message!");
        logger.log(Level.FINE, "A fine message!");
        logger.log(Level.FINER, "A finer message!");
        logger.log(Level.FINEST, "A finest message!");
    }
}
