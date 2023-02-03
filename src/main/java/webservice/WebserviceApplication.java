package webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = {webservice.repository.AdminRepository.class})
public class WebserviceApplication {
	public static void main(String[] args) {
		SpringApplication.run(WebserviceApplication.class, args);
	}

}
