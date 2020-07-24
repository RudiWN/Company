package com.company.company.controller;

import com.company.company.model.Department;
import com.company.company.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class DepartmentService {

    @Autowired
    DepartmentRepository dr;

    @Autowired
    EmployeeRepository er;

    public Department addEmployee(long departmentid, long employeeid) {
        Department department = dr.findById(departmentid).get();
        Employee employee = er.findById(employeeid).get();
        department.addEmployees(employee);
        System.out.println("Add Employee to database (one to many)");
        return dr.save(department);
    }

    public void deleteDepartmentById(long id) {
        System.out.println("Called delete department by id");
        dr.deleteById(id);
    }

    public Department addDepartment(Department department) {
        System.out.println("Called add department service");
        return dr.save(department);
    }

    public Iterable<Department> getAllDepartments() {
        System.out.println("Called get all departments service ");
        return dr.findAll();
    }

    public Department getById(long id) {
        System.out.println("Called  get department by id");
        return dr.findById(id).get();
    }


}
