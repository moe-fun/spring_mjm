package com.example.spring_mjm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMjmApplication {

	//1. Click run to initialize
	//2. Brings up Hibernate
	//3. Hibernate will see JPA Configuration
	//4. Runs bootstrap class
	// Note; No sql written. Hibernate is actually generating the ddl sql statements to create the database tables
	// based on our JPA definitions.

	public static void main(String[] args) {
		SpringApplication.run(SpringMjmApplication.class, args);
	}

}
