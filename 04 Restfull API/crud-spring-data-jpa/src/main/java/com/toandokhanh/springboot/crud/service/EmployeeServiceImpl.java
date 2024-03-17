package com.toandokhanh.springboot.crud.service;

import com.toandokhanh.springboot.crud.entity.Employee;
import com.toandokhanh.springboot.crud.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository theEmployeeRepository){
        employeeRepository = theEmployeeRepository;
    }
    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int id) {
        Employee employee = null;
        Optional<Employee> result = employeeRepository.findById(id);
        if (result.isPresent()){
            employee = result.get();
        } else {
            throw new RuntimeException("Did not find employee id - "+id);
        }
        return employee;
    }

    @Transactional
    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Transactional
    @Override
    public void deleteById(int id) {
        employeeRepository.deleteById(id);
    }
}
