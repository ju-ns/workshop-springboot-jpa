package com.estudospring.course.repositories;

import com.estudospring.course.entities.OrderItem;
import com.estudospring.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}
