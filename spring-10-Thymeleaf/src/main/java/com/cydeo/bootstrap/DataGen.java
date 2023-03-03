package com.cydeo.bootstrap;

import com.cydeo.model.Student;
import com.github.javafaker.Faker;

import java.util.Arrays;
import java.util.List;

public class DataGen {

    public static List<Student> createStudent() {

        List<Student> students = Arrays.asList(
                new Student(new Faker().name().firstName(), new Faker().name().lastName(), new Faker().address().state(), new Faker().number().numberBetween(20, 60)),
                new Student(new Faker().name().firstName(), new Faker().name().lastName(), new Faker().address().state(), new Faker().number().numberBetween(20, 60)),
                new Student(new Faker().name().firstName(), new Faker().name().lastName(), new Faker().address().state(), new Faker().number().numberBetween(20, 60)),
                new Student(new Faker().name().firstName(), new Faker().name().lastName(), new Faker().address().state(), new Faker().number().numberBetween(20, 60))

        );
        return students;
    }


}
