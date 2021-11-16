package s08logformatter;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FormatterTest {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(FormatterTest.class.getName());
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setFormatter(new MyFormatter());
        logger.setUseParentHandlers(false);
        logger.addHandler(consoleHandler);

        logger.log(Level.SEVERE, "formatted log message");
    }
}
