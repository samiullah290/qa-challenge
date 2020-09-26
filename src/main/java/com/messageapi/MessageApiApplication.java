package com.messageapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MessageApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessageApiApplication.class, args);
	}

}
