package com.example.firstservice;

import com.example.firstservice.kafka.configs.KafkaTopicConfig;
import lombok.AllArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class Sender {

	private KafkaTemplate<String, String> kafkaTemplate;
	private KafkaTopicConfig topicConfig;

	public void sendMessage(String message) {
		kafkaTemplate.send(topicConfig.myTopic().name(), message);
	}

}
