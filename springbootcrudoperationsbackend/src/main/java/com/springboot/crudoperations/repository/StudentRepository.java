package com.springboot.crudoperations.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.crudoperations.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
