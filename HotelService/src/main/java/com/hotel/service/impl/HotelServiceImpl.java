package com.hotel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.model.Hotel;
import com.hotel.repository.HotelRepository;
import com.hotel.service.HotelService;
import com.hotel.service.exception.ResourceNotFoundException;

@Service
public class HotelServiceImpl implements HotelService {
  @Autowired
	private HotelRepository repo;
	@Override
	public Hotel createHotel(Hotel hotel) {
		return repo.save(hotel);
	}

	@Override
	public List<Hotel> getAllHotel() {
		return repo.findAll();
	}

	@Override
	public Hotel getHotel(String id) {
		return repo.findById(id).orElseThrow(()->new ResourceNotFoundException("hotel with given id:-" +id+" not found !!"));
	}

	@Override
	public String deleteHotelId(String id) {
		Hotel hotel=repo.findById(id).orElseThrow(()->new ResourceNotFoundException("hotel with given id:-" +id+" not found !!")); 
		 repo.deleteById(id);
		 return hotel.getId();
	}

}
