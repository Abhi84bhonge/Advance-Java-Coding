package com.LibMangtSys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class LibMangtSysApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibMangtSysApplication.class, args);
	  System.err.println("App Started!!");
	}

}
