package com.company.company.controller;

import com.company.company.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class DepartmentService {

    @Autowired
    DepartmentRepository dr;

    public Iterable<Department> getAllDepartments() {
        System.out.println("Alle departments opgevraagd.");
        return dr.findAll();
    }

}
