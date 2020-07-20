package com.company.company.rest;

import com.company.company.controller.DepartmentService;
import com.company.company.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentEndpoint {

    @Autowired
    DepartmentService ds;

    @GetMapping("/department")
    public Iterable<Department> getAllDepartments() {
        return ds.getAllDepartments();
    }
}

