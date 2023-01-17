package com.example.main.kafkaProducerConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class KafkaProducer {
	
	@Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    
	final static String topic="javaguides";
    
    public void sendMessage(String message) {
    	log.info(String.format("message sent -> %s", message));
    	kafkaTemplate.send(topic, message);
    }
    
    
    
}
