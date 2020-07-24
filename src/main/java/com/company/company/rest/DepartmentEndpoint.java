package com.company.company.rest;

import com.company.company.controller.DepartmentService;
import com.company.company.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/department")
public class DepartmentEndpoint {

    @Autowired
    DepartmentService ds;

    @PutMapping("/addemployee/{departmentid}/{employeeid}")
    public Department addEmployeeToDepartment(@PathVariable(value = "departmentid") long departmentid, @PathVariable(value = "employeeid") long employeeid) {
        return ds.addEmployee(departmentid, employeeid);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteDepartment(@PathVariable(value = "id") long id) {
        ds.deleteDepartmentById(id);
    }

    @PostMapping("/new")
    public Department addDepartment(@RequestBody Department department) {
        return ds.addDepartment(department);
    }

    @GetMapping("/all")
    public Iterable<Department> getDepartments() {
        return ds.getAllDepartments();
    }

    @GetMapping("/id/{id}")
    public Department getDepartmentById(@PathVariable(value = "id") long id) {
        return ds.getById(id);


    }
}
