package com.toandokhanh.springboot.crud.dao;

import com.toandokhanh.springboot.crud.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee employee);

    void deleteById(int id);

}
