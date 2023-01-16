package com.example.main.fallbackController;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/fallbackMethod")
@Log4j2
public class FallBackController {
	 int count=1;
	@GetMapping("/serviceAFallBackMethod")
	public String serviceAFallback() {
		log.info("fallback method call "+ count++ +"time at "+ new Date());
		return "we have facing some issue to connect service A , please try after some time";
	}
	
	@GetMapping("/serviceBFallBackMethod")
	public String serviceBFallback() {
		return "we have facing some issue to connect service B , please try after some time";
	}

}
