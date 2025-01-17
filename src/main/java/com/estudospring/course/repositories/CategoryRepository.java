package com.estudospring.course.repositories;

import com.estudospring.course.entities.Category;
import com.estudospring.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
