package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	static void myMethod() {
    System.out.println("I just got executed!");
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


}
