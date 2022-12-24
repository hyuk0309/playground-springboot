package com.elvis.springboot;

import static org.assertj.core.api.AssertionsForClassTypes.*;

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
		assertThat(tempService).isNotNull();
	}

	// @Configuration
	// static class Config {
	// }
}
