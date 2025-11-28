package com.Infosys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.Infosys")
public class InsosysEmployeeApplication {

	public static void main(String[] args) {
	SpringApplication.run(InsosysEmployeeApplication.class, args);
	  System.err.println("App Started Successfully!!");
	}

}
