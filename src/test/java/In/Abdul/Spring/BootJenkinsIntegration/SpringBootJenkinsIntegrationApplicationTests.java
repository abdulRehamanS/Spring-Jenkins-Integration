package In.Abdul.Spring.BootJenkinsIntegration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootJenkinsIntegrationApplicationTests {

	Logger logger = LoggerFactory.getLogger(SpringBootJenkinsIntegrationApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Test case is started");
        Assertions.assertTrue(true);
	}

}
