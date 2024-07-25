package com.itc.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ItcJenkinsApplicationTests {
	
	public static Logger logger = LoggerFactory.getLogger(ItcJenkinsApplication.class);

	@Test
	void contextLoads() {
		
		logger.info("**************** test case executed *********************");
		logger.info("**************** test case executed1 *********************");
		logger.info("**************** test case executed2 *********************");
		logger.info("**************** test case executed3 *********************");
		assertEquals(true, true);
		
	}
	
	@Test
	void myTest() {
		
		logger.info("**************** test case executed *********************");
		logger.info("**************** test case executed1 *********************");
		logger.info("**************** test case executed2 *********************");
		logger.info("**************** test case executed3 *********************");
		assertEquals(true, true);
		
	}
	
	
	

}
