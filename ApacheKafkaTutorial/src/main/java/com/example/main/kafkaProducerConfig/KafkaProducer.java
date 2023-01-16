package com.example.main.kafkaProducerConfig;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@AllArgsConstructor
public class KafkaProducer {
	
	
    private KafkaTemplate<String, String> kafkaTemplate;
    
    
    public void sendMessage(String message) {
    	log.info(String.format("message sent %s", message));
    	kafkaTemplate.send("javaguides", message);
    }
    
    
    
}
