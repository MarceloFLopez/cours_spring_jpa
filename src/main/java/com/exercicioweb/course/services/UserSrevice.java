package com.exercicioweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exercicioweb.course.entities.User;
import com.exercicioweb.course.repository.UserRepository;

@Service // registra a classe como um serviço para ser injetado
public class UserSrevice {

	@Autowired
	private UserRepository repository;

	public List<User> findAll() {
		return repository.findAll();
	}

	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
}
