package s10loghandler;

import java.util.logging.*;

public class HandlerTest {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(HandlerTest.class.getName());
        logger.setUseParentHandlers(false);

        ConsoleHandler consoleHandler = new ConsoleHandler();
        XMLFormatter xmlFormatter = new XMLFormatter();
        consoleHandler.setFormatter(xmlFormatter);

        StreamHandler streamHandler = new StreamHandler(System.out, xmlFormatter);

        //logger.addHandler(consoleHandler);
        logger.addHandler(streamHandler);

        logger.log(Level.INFO, "some message formatted in xml");
    }
}
