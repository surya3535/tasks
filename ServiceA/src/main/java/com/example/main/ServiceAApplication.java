package com.example.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ServiceAApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceAApplication.class, args);
	}
    int count=0;
	@GetMapping("/a")
	public String serviceA() {
//		try {
//			Thread.sleep(2000);
//			
//		} catch (Exception e) {
//			e.getStackTrace();
//		}
		count++;
		return "service A is running count="+count;
	}

}
