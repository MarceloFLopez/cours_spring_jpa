package com.exercicioweb.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exercicioweb.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
