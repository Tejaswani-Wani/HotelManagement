package com.MiniProject.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MiniProject.daos.RoomsDaos;
import com.MiniProject.exception.ResourceNotFoundException;
import com.MiniProject.models.Rooms;
import com.MiniProject.servicesImpl.RoomServiceImpl;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/Rooms")
public class RoomsController {

	@Autowired
	private RoomsDaos roomsDaos;
	private RoomServiceImpl roomServiceImpl;
	
	
	@GetMapping("/rooms")
	public List<Rooms> getAllRooms(){
		return roomsDaos.findAll();
		
	}
	
	@GetMapping("/rooms/{id}")
	public ResponseEntity<Rooms> getRoomsById(@PathVariable Long id) throws ResourceNotFoundException{
		Rooms rooms = roomsDaos.findById(id).orElseThrow(()-> new ResourceNotFoundException("Room with Id ::"+id+"not found"));
		return ResponseEntity.ok().body(rooms);
	}
	
	
	@PostMapping("/rooms")
	public Rooms createRooms(@RequestBody Rooms rooms) {
		return roomsDaos.save(rooms);
		
	}
	

	@PutMapping("/rooms/{id}")
	public ResponseEntity<Rooms> updateRooms(@PathVariable Long id,@RequestBody Rooms room)throws ResourceNotFoundException{
		Rooms roomToUpdate=roomsDaos.findById(id).orElseThrow(()-> new ResourceNotFoundException("Room with Id not found::"+id));
		roomToUpdate.setCity(room.getCity());
		roomToUpdate.setRoom_available(room.getRoom_available());
		roomToUpdate.setRoom_price(room.getRoom_price());
		roomToUpdate.setRoom_type(room.getRoom_type());
		roomToUpdate.setRoom_taken(room.getRoom_taken());
		Rooms updateRooms = roomsDaos.save(roomToUpdate);
		return ResponseEntity.ok(updateRooms);
	}
	
	@DeleteMapping("/rooms/{id}")
	public Map<String, Boolean> deleteRoom(@PathVariable Long id) throws ResourceNotFoundException{
		Rooms rooms = roomsDaos.findById(id).orElseThrow(()-> new ResourceNotFoundException("Room with ID not found ::"+id));
		roomsDaos.delete(rooms);
		Map<String, Boolean> response = new HashMap<>();
		response.put("DELETED", Boolean.TRUE);
		return response;
		

		}
	
	@GetMapping("/rooms/{city}")
	public List<Rooms> getAllRoomsByCity(@PathVariable String id){
		return roomServiceImpl.findAll();
		
	}

	
	

}
