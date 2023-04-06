package com.cydeo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    private long id;

    private String firstName, lastName, email;

    private char gender;

}
