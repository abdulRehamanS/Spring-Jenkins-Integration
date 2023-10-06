package In.Abdul.Spring.BootJenkinsIntegration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJenkinsIntegrationApplication {

    public static Logger logger = LoggerFactory.getLogger(SpringBootApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJenkinsIntegrationApplication.class, args);
        logger.info("Application Executed");
    }

    public void init() {
        logger.info("Application started");
    }

}
