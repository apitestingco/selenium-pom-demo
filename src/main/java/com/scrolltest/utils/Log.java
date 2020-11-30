package com.scrolltest.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {

    // XML config where we format of logs - TimeStamp, any other info.
    // Start Test and End Test logs
    // Custom wrapper of logs

    static {
        String log4jpath = System.getProperty("user.dir")+"/src/main/resources/log4j.xml";
        System.setProperty("logoutputpath",System.getProperty("user.dir"));
        System.setProperty("log4j.configurationFile",log4jpath);
    }

    public static Logger Log = LogManager.getLogger(Log.class.getName());

    public static void startTestCase(String sTestCaseName){

        Log.info("****************************************************************************************");

        Log.info("****************************************************************************************");

        Log.info("$$$$$$$$$$$$$$$$$$$$$                 "+sTestCaseName+ "       $$$$$$$$$$$$$$$$$$$$$$$$$");

        Log.info("****************************************************************************************");

        Log.info("****************************************************************************************");

    }

    public static void endTestCase(String sTestCaseName){

        Log.info("XXXXXXXXXXXXXXXXXXXXXXX             "+"-E---N---D-"+"             XXXXXXXXXXXXXXXXXXXXXX");

        Log.info("X");

        Log.info("X");

        Log.info("X");

        Log.info("X");

    }

    // Log level methods

    public static void info(String message) {

        Log.info(message);

    }

    public static void warn(String message) {

        Log.warn(message);

    }

    public static void error(String message, Exception e) {

        Log.error(message,e);

    }

    public static void fatal(String message) {

        Log.fatal(message);

    }

    public static void debug(String message) {

        Log.debug(message);

    }


}
