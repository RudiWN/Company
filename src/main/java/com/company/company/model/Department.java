package com.company.company.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;

    @OneToMany
    @JoinColumn(name = "employee_id")
    private List<Employee> employees = new ArrayList<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getEmployees() {
        return employees;
    }

    public void setEmployees(List employees) {
        this.employees = employees;
    }

    public void addEmployees(Employee employee) {
        this.employees.add(employee);
    }


}
