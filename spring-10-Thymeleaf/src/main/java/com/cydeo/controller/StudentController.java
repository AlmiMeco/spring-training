package com.cydeo.controller;

import com.cydeo.bootstrap.DataGen;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {


    @RequestMapping("/register")
    public String register(Model model) {

        model.addAttribute("students", DataGen.createStudent());

        return "student/register";
    }

    @RequestMapping("/welcome")
    public String welcome() {

        return "student/welcome";
    }

}
