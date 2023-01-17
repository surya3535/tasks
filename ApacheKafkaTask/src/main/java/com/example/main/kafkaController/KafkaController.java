package com.example.main.kafkaController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.main.JsonKafka.JsonKafkaProducer;
import com.example.main.JsonKafka.User;
import com.example.main.kafkaProducerConfig.KafkaProducer;



@RestController
@RequestMapping("/api/kafka")
public class KafkaController {
	
	@Autowired
	private KafkaProducer kafkaproducer;
	
	@Autowired
	private JsonKafkaProducer jsonKafkaProducer;

	@GetMapping("/getword")
	public String getword() {
		return "the kafka project is running";
	}

	@GetMapping("/publish/String/{message}")
	public ResponseEntity<String> sendStringMessage(@PathVariable String message) {
		kafkaproducer.sendMessage(message);
		return ResponseEntity.ok("message has been sent to topic through publish1 method");

	}
	
	@PostMapping("/publish/Json")
	public ResponseEntity<String> sendJsonMessage(@RequestBody User user) {
		jsonKafkaProducer.sendMessage(user);
		return ResponseEntity.ok("Json-message sent to topic through sendJsonMessage method");
	}
	
}
