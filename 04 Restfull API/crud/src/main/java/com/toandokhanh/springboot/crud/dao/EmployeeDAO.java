package com.toandokhanh.springboot.crud.dao;

import com.toandokhanh.springboot.crud.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
}
