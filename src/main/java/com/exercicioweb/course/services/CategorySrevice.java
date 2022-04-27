package com.exercicioweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exercicioweb.course.entities.Category;
import com.exercicioweb.course.repository.CategoryRepository;

@Service // registra a classe como um serviço para ser injetado
public class CategorySrevice {

	@Autowired
	private CategoryRepository repository;

	public List<Category> findAll() {
		return repository.findAll();
	}

	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
