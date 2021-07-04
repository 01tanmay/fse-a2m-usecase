package com.stockmarket.companydetails;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CompanyDetailsForStockMarketApplication {

	private static final Logger LOGGER = LogManager.getLogger(CompanyDetailsForStockMarketApplication.class);

	public static void main(String[] args) {
		LOGGER.info("Starting Company details Application...");
		SpringApplication.run(CompanyDetailsForStockMarketApplication.class, args);
	}

}
