package com.flyway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories
public class SpringBootFlywayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFlywayApplication.class, args);
	}

}
