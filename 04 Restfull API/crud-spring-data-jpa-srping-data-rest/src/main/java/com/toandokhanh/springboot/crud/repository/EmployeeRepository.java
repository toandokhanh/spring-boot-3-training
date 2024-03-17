package com.toandokhanh.springboot.crud.repository;

import com.toandokhanh.springboot.crud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // no need code to write any code :D
}
