package com.MiniProject.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MiniProject.models.Rooms;

public interface RoomsDaos extends JpaRepository<Rooms, Long> {

		List<Rooms> getAllRoomsByCity(String city );
}
