package com.spring.kafka.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.DltHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.RetryableTopic;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Service;

import com.spring.kafka.dto.Customer;

@Service
public class MessageListener {

	Logger logger = LoggerFactory.getLogger(MessageListener.class);

	@KafkaListener(topics = "RetryDemoTopic", groupId = "RetryDemoGroup")
	@RetryableTopic(attempts = "4") // 3 (n-1) retries
	public void eventConsumer(Customer customer, @Header(KafkaHeaders.RECEIVED_TOPIC) String topic,
			@Header(KafkaHeaders.OFFSET) long offset) {

		logger.info("Received : {} , from {} , offset {}", customer, topic, offset);

		if (customer.getEmail().contains("test")) {
			throw new RuntimeException("Invalid EmailId");
		}
	}

	@DltHandler
	public void dltHandler(Customer customer, @Header(KafkaHeaders.RECEIVED_TOPIC) String topic,
			@Header(KafkaHeaders.OFFSET) long offset) {
		logger.info("DltHandler Received : {} , from {} , offset {}", customer, topic, offset);
	}
}