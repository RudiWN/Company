package com.company.company.rest;

import com.company.company.controller.EmployeeService;
import com.company.company.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employee")
public class EmployeeEndpoint {

    @Autowired
    EmployeeService es;

    @PostMapping("/new")
    public Employee addEmployee(@RequestBody Employee employee) {
        return es.addEmployee(employee);
    }

    @GetMapping("/all")
    public Iterable<Employee> getAllEmployee() {
        return es.getAllEmployee();
    }
}
