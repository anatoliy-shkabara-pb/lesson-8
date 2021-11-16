package s09logfilter;

import java.util.logging.Level;
import java.util.logging.Logger;

public class FilterTest {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(FilterTest.class.getName());
        logger.setFilter(new MyFilter());

        logger.log(Level.SEVERE, "Hi, it's first message.");
        logger.log(Level.SEVERE, "Hi, it's second message.");
    }
}
