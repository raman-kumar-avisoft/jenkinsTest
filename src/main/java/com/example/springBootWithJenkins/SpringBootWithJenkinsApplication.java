package com.example.springBootWithJenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWithJenkinsApplication implements CommandLineRunner {

	public static final Logger logger = LoggerFactory.getLogger(SpringBootWithJenkinsApplication.class);
	
	public static void main(String[] args) {
		logger.info("Its a continous integration job");
		SpringApplication.run(SpringBootWithJenkinsApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		logger.info("Its my second logger");
	}

}
