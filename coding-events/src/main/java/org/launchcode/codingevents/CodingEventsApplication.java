package org.launchcode.codingevents;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class CodingEventsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodingEventsApplication.class, args);
	}

}
