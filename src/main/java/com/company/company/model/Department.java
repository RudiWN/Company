package com.company.company.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
<<<<<<< HEAD
=======
import java.util.ArrayList;
>>>>>>> master

@Entity
public class Department {
    @Id
<<<<<<< HEAD
    @GeneratedValue(strategy= GenerationType.AUTO)
    long id;
=======
    @GeneratedValue(strategy = GenerationType.AUTO)
    long Id;
>>>>>>> master

    private String name;
}
