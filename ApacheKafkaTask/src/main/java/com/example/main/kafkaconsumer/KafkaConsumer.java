package com.example.main.kafkaconsumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class KafkaConsumer {
	final static String topic="javaguides";
	 
@KafkaListener(topics = topic, groupId = "group-1")
	public void consume(String message) {
		log.info(String.format("message recieved -> %s", message));
		}
}
