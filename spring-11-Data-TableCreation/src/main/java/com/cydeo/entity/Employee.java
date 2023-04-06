package com.cydeo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity // <- CREATING TABLE
public class Employee {

    @Id // <- making 'id' the dataTables primary-key
    private int id;

    private String fistName, lastName, email;




}
