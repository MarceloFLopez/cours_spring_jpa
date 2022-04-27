package com.exercicioweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exercicioweb.course.entities.Product;
import com.exercicioweb.course.repository.ProductRepository;

@Service // registra a classe como um serviço para ser injetado
public class ProductSrevice {

	@Autowired
	private ProductRepository repository;

	public List<Product> findAll() {
		return repository.findAll();
	}

	public Product findById(Long id) {
		Optional<Product> obj =repository.findById(id);
		return obj.get();
	}
}
