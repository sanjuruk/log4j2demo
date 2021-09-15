package com.example.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {
    protected static Logger logger = null;

    public static Boolean setupLogging(String logFileName) {
        System.setProperty("logFilename", logFileName);
    
        try {
            logger = LogManager.getLogger();  
        } catch (Exception e) {
            System.out.println("setupLogging Exception: " + e.getMessage());
            return false;
        }

        return true;
    }
    
    public static void logError(String logMessage) {
        logger.error(logMessage);
    }

    public static void logTrace(String logMessage) {
        logger.trace(logMessage);
    }

    public static void logDebug(String logMessage) {
        logger.debug(logMessage);
    }
}
