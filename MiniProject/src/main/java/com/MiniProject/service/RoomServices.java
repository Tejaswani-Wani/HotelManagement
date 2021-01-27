package com.MiniProject.service;

import java.util.List;

import com.MiniProject.models.Rooms;

public interface RoomServices {
	List<Rooms> getAllRoomsByCity(String city);

}
