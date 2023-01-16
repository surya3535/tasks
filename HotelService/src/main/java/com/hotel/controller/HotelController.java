package com.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.model.Hotel;
import com.hotel.service.impl.HotelServiceImpl;

@RestController
@RequestMapping("/hotel")
public class HotelController {
	@Autowired
	private HotelServiceImpl service;

	@GetMapping("/getword")
	public ResponseEntity<String> getword() {
		return ResponseEntity.status(HttpStatus.FOUND).body("this is hotel service");

	}

	@PostMapping("/")
	public ResponseEntity<Hotel> saveHotel(@RequestBody Hotel hotel) {
		return ResponseEntity.status(HttpStatus.CREATED).body(service.createHotel(hotel));
	}

	@GetMapping("/{id}")
	public ResponseEntity<Hotel> getHotel(@PathVariable String id) {
		return ResponseEntity.status(HttpStatus.FOUND).body(service.getHotel(id));
	}

	@GetMapping("/")
	public ResponseEntity<List<Hotel>> getAllHotels() {
		return ResponseEntity.status(HttpStatus.FOUND).body(service.getAllHotel());
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteHotel(@PathVariable String id) {
		return ResponseEntity.status(HttpStatus.OK).body(service.deleteHotelId(id));

	}

}
