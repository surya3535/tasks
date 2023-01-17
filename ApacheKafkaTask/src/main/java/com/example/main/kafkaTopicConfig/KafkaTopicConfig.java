package com.example.main.kafkaTopicConfig;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
	
	final static String topic="javaguides",topic2="javaguides_json";

	@Bean
	public NewTopic javaGuidesTopic() {
		return TopicBuilder.name(topic).build();
	}
	
	@Bean
	public NewTopic javaGuidesJsonTopic() {
		return TopicBuilder.name(topic2).build();
	}
	
	
}
