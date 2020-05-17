package com.example.demo1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldBootApplication {

	//test
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldBootApplication.class, args);
		System.out.println("hi test");
	}

}
