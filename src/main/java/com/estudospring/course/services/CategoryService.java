package com.estudospring.course.services;

import com.estudospring.course.entities.Category;
import com.estudospring.course.entities.User;
import com.estudospring.course.repositories.CategoryRepository;
import com.estudospring.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }


    public Category findById(Long id){
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
