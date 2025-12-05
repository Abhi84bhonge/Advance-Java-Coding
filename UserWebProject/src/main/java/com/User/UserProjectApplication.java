package com.User;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class UserProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserProjectApplication.class, args);
	     System.err.println("App Started!!");
	}

}
