package com.spring.springKafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.springKafka.service.producer;

@RestController
@RequestMapping("/rest/api")
public class RestControllerForKafkaMsg {
	
	@Autowired
	producer prod;
	
	@GetMapping("/producerMsg")
	public void getMessageFromClient(@RequestParam("message") String message) {
		 prod.sendMsgToTopic(message);
		 //return "I am returning from controller";
	}
}
