package com.cydeo.entity;

import javax.persistence.*;

@Entity
@Table(name = "students") // <- Change tableName
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // <- primaryKey auto-generation
    private long id;

    private String firstName, lastName, email;

    @Column(name = "maleOrFemale") // <- Change columnName
    private char gender;

    @Transient
    private String address;



}
