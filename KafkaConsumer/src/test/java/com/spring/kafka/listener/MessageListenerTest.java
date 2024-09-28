package com.spring.kafka.listener;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.awaitility.Awaitility;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.KafkaContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.utility.DockerImageName;

import com.spring.kafka.dto.Customer;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Testcontainers
public class MessageListenerTest {

	@Container
	private static KafkaContainer kafka = new KafkaContainer(DockerImageName.parse("confluentinc/cp-kafka:latest"));

	@Autowired
	private KafkaTemplate<String, Object> kafkaTemplate;

	@DynamicPropertySource
	public static void initkafkaProperties(DynamicPropertyRegistry registry) {
		registry.add("spring.kafka.bootstrap-servers", kafka::getBootstrapServers);
	}

	@Test
	public void testEventConsumer1() {

		System.out.println("testEventConsumer1 method execution started");

		Customer customer = new Customer();
		customer.setId(1);
		customer.setName("testName");
		customer.setEmail("testEmail");
		customer.setContactNo("testContactNo");

		kafkaTemplate.send("DemoTopic1", customer);

		System.out.println("testEventConsumer1 method execution ended");

		Awaitility.await().pollInterval(Duration.ofSeconds(3)).atMost(10, TimeUnit.SECONDS).untilAsserted(() -> {
			// assert statement
		});
	}
}