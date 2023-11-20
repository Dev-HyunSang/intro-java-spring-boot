// 2023.11.20 - SpringBoot를 활용한 웹 개발 입문 - 나의 첫 Spring Boot Application
package dev.hyunsang.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

}
