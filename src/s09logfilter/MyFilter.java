package s09logfilter;

import java.util.logging.Filter;
import java.util.logging.LogRecord;

public class MyFilter implements Filter {

    @Override
    public boolean isLoggable(LogRecord record) {
        return false;
        //return record.getMessage().contains("second");
    }
}
