package com.tka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class InstagramUserApplication {

	public static void main(String[] args) {
	
			SpringApplication.run(InstagramUserApplication.class, args);
//		ApplicationContext ac=SpringApplication.run(InstagramUserApplication.class, args);
//		for (String string : ac.getBeanDefinitionNames()) {
//		if(string .contains("instagram")) {
//			System.out.println(string);
//		}
//	}
//	System.out.println(ac.getBeanDefinitionCount());
//	System.out.println(ac.getBeanDefinitionNames().toString());
	System.err.println("App Started!!");
	  
	  
	}

}
