package com.exercicioweb.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exercicioweb.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
