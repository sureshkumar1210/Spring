package com.example.api.demo.dao;

import com.example.api.demo.model.student;
import org.springframework.data.repository.CrudRepository;

public interface studentDao extends CrudRepository<student,Integer> {
}
