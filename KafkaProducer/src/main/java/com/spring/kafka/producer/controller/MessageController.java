package com.spring.kafka.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.kafka.producer.service.MessagePublisher;

@RestController
@RequestMapping("/producer-app")
public class MessageController {

	@Autowired
	private MessagePublisher publisher;

	@PostMapping("/publish/{message}")
	public ResponseEntity<?> publishMessage(@PathVariable String message) {
		try {
			for (int id = 1; id <= 10000; id++) {
				publisher.sendMessageToTopic(message + " : " + id);
			}
			return ResponseEntity.ok("message published successfully");
		} catch (Exception exception) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
}