package com.example.LogsHTTP;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogsHttpApplication {

	private static Logger logger = LoggerFactory.getLogger(LogsHttpApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LogsHttpApplication.class, args);
		logger.info("Mensaje de informacion");
		/*logger.error("Mensaje de error");
		logger.warn("Mensaje de warning");
		logger.debug("Mensaje de debug");
		logger.trace("Mensaje de trace");*/
	}

}
