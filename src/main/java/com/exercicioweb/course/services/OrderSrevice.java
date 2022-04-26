package com.exercicioweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exercicioweb.course.entities.Order;
import com.exercicioweb.course.repository.OrderRepository;

@Service // registra a classe como um serviço para ser injetado
public class OrderSrevice {

	@Autowired
	private OrderRepository repository;

	public List<Order> findAll() {
		return repository.findAll();
	}

	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
