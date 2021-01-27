package com.MiniProject.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Rooms")
public class Rooms {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private long id;
	@Column(name="city",nullable=false)
	private String city;
	@Column(name="room_type",nullable=false)
	private String room_type;
	@Column(name="room_price",nullable=false)
	private int room_price;
	@Column(name="room_available",nullable=false)
	private String room_available;
	@Column(name="room_taken",nullable=false)
	private String room_taken;
	public Rooms(long id, String city, String room_type, int room_price, String room_available, String room_taken) {
		super();
		this.id = id;
		this.city = city;
		this.room_type = room_type;
		this.room_price = room_price;
		this.room_available = room_available;
		this.room_taken = room_taken;
	}
	public Rooms() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getRoom_type() {
		return room_type;
	}
	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}
	public int getRoom_price() {
		return room_price;
	}
	public void setRoom_price(int room_price) {
		this.room_price = room_price;
	}
	public String getRoom_available() {
		return room_available;
	}
	public void setRoom_available(String room_available) {
		this.room_available = room_available;
	}
	public String getRoom_taken() {
		return room_taken;
	}
	public void setRoom_taken(String room_taken) {
		this.room_taken = room_taken;
	}
	
	
	
	
}
