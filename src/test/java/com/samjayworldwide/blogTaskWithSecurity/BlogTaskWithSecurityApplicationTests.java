package com.samjayworldwide.blogTaskWithSecurity;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(locations = "classpath:application-integration.properties")
@ActiveProfiles("integration-tests")
class BlogTaskWithSecurityApplicationTests {

	@Test
	void contextLoads() {
	}

}
