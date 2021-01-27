package com.MiniProject.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.MiniProject.daos.RoomsDaos;
import com.MiniProject.models.Rooms;
import com.MiniProject.service.RoomServices;

public class RoomServiceImpl implements RoomServices, RoomsDaos {
	
	
	@Autowired
	 private RoomsDaos roomsDaos;

	@Override
	public List<Rooms> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Rooms> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Rooms> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Rooms> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub

	}

	@Override
	public <S extends Rooms> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInBatch(Iterable<Rooms> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub

	}

	@Override
	public Rooms getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Rooms> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Rooms> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Rooms> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Rooms> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Rooms> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Rooms entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll(Iterable<? extends Rooms> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public <S extends Rooms> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Rooms> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Rooms> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Rooms> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Rooms> getAllRoomsByCity(String city) {
		return roomsDaos.getAllRoomsByCity(city);
		
	
	}

}
