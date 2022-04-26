package com.exercicioweb.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exercicioweb.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
