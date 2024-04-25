package org.example;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    static final Level MiLogLevel = Level.forName("Sopaipilla",550); //Ejercicio 2

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        logger.info("La consola se ha iniciado"); //Ejercicio 1

    }
}
