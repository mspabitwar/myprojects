package com.spring.kafka.producer;

import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import com.spring.kafka.dto.Customer;

@Service
public class MessagePublisher {

	@Autowired
	private KafkaTemplate<String, Object> template;

	
	public void sendEventsToTopic(Customer customer) {
		CompletableFuture<SendResult<String, Object>> future = template.send("RetryDemoTopic", customer);
		future.whenComplete((result, exception) -> {
			if (exception == null) {
				System.out
						.println("Sent Message : [" + customer + "] with offset = " + result.getRecordMetadata().offset());
			} else {
				System.out.println(
						"Unable to send Message : [" + customer + "] due to  exception : " + exception.getMessage());
			}
		});
	}
}