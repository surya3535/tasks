package com.hotel.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Hotel {
	@Id
	private String id;
	private String name;
	private String location;
	private String about;

}
