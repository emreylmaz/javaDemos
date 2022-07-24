package nLayeredDemo.core.concretes;

import nLayeredDemo.core.abstracts.LoggerService;
import nLayeredDemo.jLogger.JLoggerManager;

public class jLogServiceAdapter implements LoggerService {

    @Override
    public void log(String message) {
        JLoggerManager loggerManager = new JLoggerManager();
        loggerManager.log(message);
    }
}
