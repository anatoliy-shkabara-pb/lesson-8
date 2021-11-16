package s07logging;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LoggingExamples {

    private static final Logger LOGGER = Logger.getLogger(LoggingExamples.class.getName());

    public void doIt() {
        LOGGER.entering(getClass().getName(), "doIt");

        try{
            if (isSmthBad()) {
                throw new Exception("We have a problem...");
            }

        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error doing XYZ", e);
        }

        LOGGER.exiting(getClass().getName(), "doIt");
    }

    private boolean isSmthBad() {
        return true;
    }

    public static void main(String[] args) throws Exception {

        //System.setProperty("java.util.logging.config.file", "out/production/lesson-8/s07logging/logging.properties");
        //LogManager.getLogManager().readConfiguration();

        LoggingExamples examples = new LoggingExamples();
        examples.doIt();
    }

}
