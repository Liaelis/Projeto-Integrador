package com.elisrs.garden;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EntityScan(basePackages = "com.elisrs")
@ComponentScan(basePackages = "com.elisrs")
@EnableJpaRepositories(basePackages = "com.elisrs")
@EnableTransactionManagement
public class ProjectGardenApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectGardenApplication.class, args);
	}

}
