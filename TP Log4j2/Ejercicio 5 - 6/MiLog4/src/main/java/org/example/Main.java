package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logeer = LogManager.getFormatterLogger(Main.class);

    public static void main(String[] args) {
        logeer.info("Mensaje rotativo con CronTrigeer");
    }
}