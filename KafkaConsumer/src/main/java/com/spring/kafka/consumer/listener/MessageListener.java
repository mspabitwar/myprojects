package com.spring.kafka.consumer.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MessageListener {

	Logger logger = LoggerFactory.getLogger(MessageListener.class);

	@KafkaListener(topics = "DemoTopic", groupId = "DemoGroup")
	public void consumer1(String message) {
		logger.info("Consumer1 consumed the message {} ", message);
	}

	@KafkaListener(topics = "DemoTopic", groupId = "DemoGroup")
	public void consumer2(String message) {
		logger.info("Consumer2 consumed the message {} ", message);
	}

	@KafkaListener(topics = "DemoTopic", groupId = "DemoGroup")
	public void consumer3(String message) {
		logger.info("Consumer3 consumed the message {} ", message);
	}

	@KafkaListener(topics = "DemoTopic", groupId = "DemoGroup")
	public void consumer4(String message) {
		logger.info("Consumer4 consumed the message {} ", message);
	}

	@KafkaListener(topics = "DemoTopic", groupId = "DemoGroup")
	public void consumer5(String message) {
		logger.info("Consumer5 consumed the message {} ", message);
	}

	@KafkaListener(topics = "DemoTopic", groupId = "DemoGroup")
	public void consumer6(String message) {
		logger.info("Consumer6 consumed the message {} ", message);
	}
}