package techgeeknext.ticket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class TechgeeknextEurekaTicketServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechgeeknextEurekaTicketServiceApplication.class, args);
	}
}
