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

import com.MiniProject.daos.AdminPannelDaos;
import com.MiniProject.exception.ResourceNotFoundException;
import com.MiniProject.models.AdminPannel;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api/v1")
public class AdminPannelController {
	@Autowired
	private AdminPannelDaos adminPannelDaos;
	


	@GetMapping("/adminPannel")
	public List<AdminPannel> getAllAdmins(){
		return adminPannelDaos.findAll();
	}
	
	@GetMapping("/adminPannel/{id}")
	public ResponseEntity<AdminPannel> getAdminById(@PathVariable Long id) throws ResourceNotFoundException{
		AdminPannel adminPannel = adminPannelDaos.findById(id).orElseThrow(()->new ResourceNotFoundException("Admin not found for this Id::"+id));
		return ResponseEntity.ok().body(adminPannel);
		
	}
	
	@PostMapping("/adminPannels")
	public AdminPannel createAdmin(@RequestBody AdminPannel adminPannel) {
		return adminPannelDaos.save(adminPannel);
	}
	
	@PutMapping("/adminPannels/{id}")
	public ResponseEntity<AdminPannel> updateAdmin(@PathVariable Long id,@RequestBody AdminPannel adminPannel)throws ResourceNotFoundException{
		AdminPannel adminToUpdate=adminPannelDaos.findById(id).orElseThrow(()->new ResourceNotFoundException("Admin Not found for this id::"+id));
		adminToUpdate.setName(adminPannel.getName());
		adminToUpdate.setEmailId(adminPannel.getEmailId());
		adminToUpdate.setNumber(adminPannel.getNumber());
		adminToUpdate.setAddress(adminPannel.getAddress());
		adminToUpdate.setRole(adminPannel.getRole());
		AdminPannel updateAdmin=adminPannelDaos.save(adminToUpdate);
		return ResponseEntity.ok(updateAdmin);
		
	}
	
	@DeleteMapping("/adminPannels/{id}")
	public Map<String, Boolean> deleteAdmin(@PathVariable Long id) throws ResourceNotFoundException{
		AdminPannel adminPannel= adminPannelDaos.findById(id).orElseThrow(()->new ResourceNotFoundException("Admin Not found for this id::"+id));
		adminPannelDaos.delete(adminPannel);
		Map<String, Boolean> response=new HashMap<>();
		response.put("Deleted",Boolean.TRUE);
		return response;
	}
}
