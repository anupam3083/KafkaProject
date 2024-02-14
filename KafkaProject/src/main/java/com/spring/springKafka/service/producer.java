package com.spring.springKafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class producer {

	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	
	public void sendMsgToTopic(String message) {
		System.out.println("Hi I am in Producer");
		kafkaTemplate.send("KafkaTopic",message);
	}
}
