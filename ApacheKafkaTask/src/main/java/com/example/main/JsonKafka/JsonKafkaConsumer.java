package com.example.main.JsonKafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class JsonKafkaConsumer {
	
	final static String topic2="javaguides_json";

	@KafkaListener(topics = topic2, groupId = "group-1")
	public void consumeJsonMessage(User user) {
		log.info(String.format("message recieved -> %s", user.toString()));
		}
	
	
}
