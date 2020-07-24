package com.company.company.controller;

import com.company.company.model.Department;
import com.company.company.model.Employee;
import com.company.company.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class EmployeeService {

    @Autowired
    EmployeeRepository er;

    public Employee addEmployee(Employee employee) {
        System.out.println("Called  add employee");
        return er.save(employee);
    }

    public Iterable<Employee> getAllEmployee() {
        System.out.println("Called  get all employee service");
        return er.findAll();
    }

    public void addMessageToEmployee(Employee employee, Message theMessage) {
        System.out.println("Called add message to employee (many to many)");
        employee.addMessage(theMessage);
        er.save(employee);
    }
}
