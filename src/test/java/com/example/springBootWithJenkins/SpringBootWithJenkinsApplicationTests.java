package com.example.springBootWithJenkins;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringBootWithJenkinsApplicationTests {

	public static final Logger logger = LoggerFactory.getLogger(SpringBootWithJenkinsApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("its a test");
		assertEquals(true, true);
	}

}
