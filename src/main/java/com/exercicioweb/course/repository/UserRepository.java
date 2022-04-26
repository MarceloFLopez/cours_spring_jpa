package com.exercicioweb.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exercicioweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
