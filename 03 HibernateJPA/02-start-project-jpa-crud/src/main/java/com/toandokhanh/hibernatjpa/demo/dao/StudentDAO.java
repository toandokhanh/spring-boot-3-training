package com.toandokhanh.hibernatjpa.demo.dao;

import com.toandokhanh.hibernatjpa.demo.entity.Student;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.List;

public interface StudentDAO {
    void save(Student student);

    Student findById(Integer id);

    List<Student> findAll();

    List<Student> findByLastname(String lastName);

    void update(Student student);

    void delete(Integer id);
}
