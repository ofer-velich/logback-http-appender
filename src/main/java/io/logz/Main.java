package io.logz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * Created by ofer_v on 8/11/15.
 */
public class Main {

    final static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        // UNCOMMENT THE FOLLOWING WHEN RUNNING HTTP APPENDER CONF

        logger.info("Hello World from Logback!");


        // UNCOMMENT THE FOLLOWING WHEN RUNNING SOCKET APPENDER CONF

        // while(true) {
        //    logger.info("[YFZTkfMHvHadJihIrMoDumZHjUXJAyuK][type=logback] Hello World from Logback!");
        // }

    }

}
