package com.cydeo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mentor {


    private String firstName, lastName, email, gender, batch, jobDescription;
    private boolean graduated;




}
