package com.example.secondservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class SecondServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondServiceApplication.class, args);
	}

	@KafkaListener(topics = "myTopic", groupId = "secondService-group")
	@KafkaHandler
	public void receive(String message) {
		System.out.println("Message is " + message);
	}

}
