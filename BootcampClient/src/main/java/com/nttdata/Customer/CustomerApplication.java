package com.nttdata.Customer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerApplication implements ApplicationRunner {

	private static final Logger logger= LogManager.getLogger(CustomerApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		logger.debug("Debug de la aplicacion");
		logger.info("Info log");
		logger.warn(" Este es una alerta");
		logger.error("Opss este es un error");
		logger.fatal("Error corrigime");
	}
}
