package s07logging;

import java.util.logging.Logger;

public class LoggerHierarchy {

    public static void main(String[] args) {

        Logger logger  = Logger.getLogger("");
        Logger logger1 = Logger.getLogger("com");
        Logger logger2 = Logger.getLogger("com.jenkov");
        Logger logger3 = Logger.getLogger("com.jenkov.web");

        Logger parent = logger3.getParent();
        System.out.println(parent.getName());
    }

}
