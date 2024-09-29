package com.spring.kafka.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.spring.kafka.dto.Customer;

@Service
public class MessageListener {

	Logger logger = LoggerFactory.getLogger(MessageListener.class);

	@KafkaListener(topics = "RetryDemoTopic", groupId = "RetryDemoGroup")
	public void eventConsumer(Customer customer) {
		if(customer.getEmail().contains("test")) {
			throw new RuntimeException("Invalid EmailId");
		}
		logger.info("Consumer consumed the event : {} ", customer);
	}
}