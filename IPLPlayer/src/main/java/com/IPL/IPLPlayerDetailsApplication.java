package com.IPL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class IPLPlayerDetailsApplication {

	public static void main(String[] args) {
//		SpringApplication.run(IplPlayerDetailsApplication.class, args);
		 ApplicationContext ac= SpringApplication.run(IPLPlayerDetailsApplication.class, args);
		 System.out.println(ac.getBeanDefinitionCount());
		 for (String string : ac.getBeanDefinitionNames()) {
			if(string.contains("IPL"))
			 System.out.println(string);
		}
		 System.err.println("App Started!!");
	}

}
