package com.toandokhanh.springboot.crud.rest;

import com.toandokhanh.springboot.crud.config.ApiPathConfig;
import com.toandokhanh.springboot.crud.entity.Employee;
import com.toandokhanh.springboot.crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping(ApiPathConfig.GET_ALL_EMPLOYEE_URL)
    public List<Employee> getAll(){
        return employeeService.findAll();
    }

    @GetMapping(ApiPathConfig.GET_EMPLOYEE_BY_ID_URL)
    public Employee getById(@PathVariable int id){
        Employee employee = employeeService.findById(id);
        if(employee == null){
            throw new RuntimeException("Employee id not found - "+ id);
        }
        return employee;
    }

    @PostMapping(ApiPathConfig.ADD_EMPLOYEE_URL)
    public Employee addEmployee(@RequestBody Employee theEmployee) {

        // also just in case they pass an id in JSON ... set id to 0
        // this is to force a save of new item ... instead of update
        theEmployee.setId(0);
        Employee dbEmployee = employeeService.save(theEmployee);
        return dbEmployee;
    }

    @PutMapping(ApiPathConfig.UPDATE_EMPLOYEE_URL)
    public Employee UpdateEmployee(@RequestBody Employee theEmployee){
        Employee dbEmployee = employeeService.save(theEmployee);
        return dbEmployee;
    }

    @DeleteMapping(ApiPathConfig.DELETE_EMPLOYEE_BY_ID_URL)
    public String deleteEmployee(@PathVariable int id){
        Employee employee = employeeService.findById(id);
        if(employee == null){
            throw new RuntimeException("Employee id not found - "+ id);
        }
        employeeService.deleteById(id);
        return "Deleted employee id - " + id;
    }

}
