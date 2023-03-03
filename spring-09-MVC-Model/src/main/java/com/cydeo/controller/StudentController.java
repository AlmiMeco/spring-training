package com.cydeo.controller;

import com.cydeo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;

@Controller
public class StudentController {

    @RequestMapping("/welcome")
    public String dynamicHomePage(Model model) {

        model.addAttribute("name", "Cydeo");
        model.addAttribute("name2", "Almi");


        LocalDate birthDate = LocalDate.of(2001, 3, 13);
        model.addAttribute("date", birthDate);


        Student student = new Student(001, "Almi", "Meco");
        model.addAttribute("student", student);


        return "student/welcome";
    }
}
