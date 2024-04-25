package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        // Agregar información de seguimiento al contexto de hilo
        ThreadContext.put("userID", "123456");
        ThreadContext.put("transactionID", "ABCDEF");

        // Ejemplo de registro con información de seguimiento
        logger.info("Inicio del procesamiento");

        // Restaurar el contexto de hilo
        ThreadContext.clearMap();

    }
}