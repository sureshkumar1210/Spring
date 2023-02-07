package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Student;

public interface UserService extends CrudRepository<Student, Integer>{

}
