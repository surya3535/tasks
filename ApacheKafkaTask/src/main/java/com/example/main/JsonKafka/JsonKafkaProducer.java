package com.example.main.JsonKafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class JsonKafkaProducer {

	@Autowired
	private KafkaTemplate<String, User> kafkatemplate;
	
	final static String topic2="javaguides_json";
	
	public void sendMessage(User user) {
		 Message<User> message=MessageBuilder.withPayload(user).setHeader(KafkaHeaders.TOPIC, topic2).build();
		 kafkatemplate.send(message); 
		 log.info(String.format("message sent->%s", message));
	}
	
		
	
	
}
