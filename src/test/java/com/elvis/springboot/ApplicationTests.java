package com.elvis.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;

import com.elvis.springboot.service.TempService;

@SpringBootTest
class ApplicationTests {

	@Autowired
	private TempService tempService;

	@Test
	void contextLoads() {
	}

	// @Configuration
	// static class config {
	// }
}
