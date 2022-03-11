package com.nttdata.WebFlux;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CreditsApplication implements ApplicationRunner {

	private static final Logger logger= LogManager.getLogger(CreditsApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(CreditsApplication.class, args);
	}
	@Override
	public void run(ApplicationArguments args) throws Exception {
		logger.debug("Debug de la aplicación");
		logger.info("Info Log");
		logger.warn("Warning");
		logger.error("Error");
		logger.fatal("Fatal Error");
	}

}
