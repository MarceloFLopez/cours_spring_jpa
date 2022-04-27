package com.exercicioweb.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exercicioweb.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
