package com.cydeo.entity;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // <- CREATING TABLE
@NoArgsConstructor
public class Employee {

    @Id // <- making 'id' the dataTables primary-key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String fistName, lastName, email;


    public Employee(String fistName, String lastName, String email) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.email = email;
    }
}
