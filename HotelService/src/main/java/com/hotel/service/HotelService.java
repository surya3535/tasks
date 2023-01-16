package com.hotel.service;

import java.util.List;

import com.hotel.model.Hotel;

public interface HotelService {

	//create
	Hotel createHotel(Hotel hotel);
	
	//get
	List<Hotel> getAllHotel();
	
	//get
	Hotel getHotel(String id);
	
	//delete
	String deleteHotelId(String id);
	
}
