package com.spring.springKafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class consumer {

	@KafkaListener(topics = "KafkaTopic", groupId = "KafkaTopicGroup")
	public void listenToTopic(String receivedMessage) {
		System.out.println("Hi,,, I have received ur msg"+ receivedMessage);
	}
	
}
